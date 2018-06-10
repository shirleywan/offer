package others;

import java.nio.channels.NonWritableChannelException;
import java.util.*;

public class wangyi07 {
//	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		Stack<Integer> stack1=new Stack<Integer>();
//		Stack<Integer> stack2=new Stack<Integer>();
//		int n=in.nextInt();
//		int[] nums=new int[n];
//		for(int i=0;i<n;i++) {
//			nums[i]=in.nextInt();
//		}
//		if(n<=2) {System.out.println(0);}
//		int count=Math.abs(nums[0]-nums[1]);
//		int q=0,p=1;
//		for(int i=0;i<n-1;i++) {
//			if(Math.abs(nums[i+1]-nums[i])>count) {
//				count=Math.abs(nums[i+1]-nums[i]);q=i;p=i+1;
//			}
//		}
//		stack1.push(nums[q]);
//		stack2.push(nums[p]);
//		List<Integer> list1=new ArrayList<Integer>();
//		List<Integer> list2=new ArrayList<Integer>();
//		for(int i=q;i>=0;i--) {
//			if(Math.abs(nums[i]-stack1.peek())<=Math.abs(nums[i]-stack2.peek())) {stack1.push(nums[i]);}
//			else {stack2.push(nums[i]);}
//		}
//		while(!stack1.isEmpty()) {
//			list1.add(stack1.pop());
//		}
//		while(!stack2.isEmpty()) {
//			list2.add(stack2.pop());
//		}
//		System.out.println(list1);
//		System.out.println(list2);
//		for(int i=p;i<n;i++) {
//			int top1=list1.get(list1.size()-1);
//			int top2=list2.get(list2.size()-1);
//			if(Math.abs(nums[i]-top1)<=Math.abs(nums[i]-top2)) {list1.add(nums[i]);}
//			else{list2.add(nums[i]);}
//		}
//		System.out.println(list1);
//		System.out.println(list2);
//		count=0;
//		for(int i=0;i<list1.size()-1;i++) {
//			count=count+Math.abs(list1.get(i)-list1.get(i+1));
//		}
//		System.out.println(count);
//		for(int i=0;i<list2.size()-1;i++) {
//			count=count+Math.abs(list2.get(i)-list2.get(i+1));
//		}
//		System.out.println(count);
//	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=in.nextInt();
		}
		int[][] dp=new int[n][n-1];
		int[] acc=new int[n];
		dp[1][0]=0;
		acc[1]=0;
		for(int i=2;i<n;i++) {
			acc[i]=acc[i-1]+Math.abs(nums[i-1]-nums[i-2]);
			dp[i][i-1]=acc[i];
			for(int j=0;j<i-1;j++) {
				//j=0时表示前面0个都由1个歌手唱，也就是所有都由1名歌手唱
				dp[i][j]=dp[i-1][j]+Math.abs(nums[i]-nums[i-1]);
				dp[i][i-1]=Math.min(dp[i][i-1], dp[i-1][j]+Math.abs(nums[i]-nums[j]));
			}
		}
		int min=dp[n-1][0];
		for(int i=1;i<n-1;i++) {
			if(dp[n-1][i]<min) {min=dp[n-1][i];}
		}
		System.out.println(min);
	}
}
