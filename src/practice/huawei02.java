package practice;

import java.util.*;

public class huawei02 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++){
			num[i]=in.nextInt();
		}
		System.out.println(work(n,num));
	}
	public static int work(int n,int[] num){
		int sum=num[0];
		int x=0,count=0;
		if(n==1){return 0;}
		count++;
		while(sum<n-1){
			count++;
			if(max(x,sum,num)>=n-1){return count;}
			else if(max(x, sum, num)<= sum){break; }
			else{x=max(x, sum, num)-sum; sum=sum+x;}
		}
		if(sum<n-1){return 0;}
		return count;
	}
	public static int max(int i,int n,int[] num){
		int max=0;
		while(i<=n){
			if(max<=num[i]+i && num[i]!=0){
				max=num[i]+i;
			}
			i++;
		}
		return max;
	}
}
