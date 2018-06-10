package others;

import java.util.*;
//
//public class wangyi04 {
//	public static int findWay(int n,int l,int[] child) {
//		int m=length(0, 0, child);
//		if(m>l) {return l+1;}
//		if(l>n) {return n;}
//		return m+(l-m)/2;
//	}
//	public static int length(int n, int count,int[] child) {
//		if(child[n]==0) {return count;}
//		else {count=length(child[n], count, child)+1;}
//		return count;
//	}
//	
//	public static void main(String[] args) {
//        Scanner in = new Scanner(System.in); 
//        int n=in.nextInt();
//        int l=in.nextInt();
//        int[] child=new int[n];
//        for(int i=0;i<n-1;i++) {
//			child[i]=in.nextInt()+1;
//        }
//
//        int m=findWay(n, l, child);
//        System.out.println(m);
////        int num = Integer.valueOf(str).intValue();
////		System.out.println(findWay(str,s));
//	}
//}
public class wangyi04{
    static int n;
    static int[]parent;
    static int l;
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        l=in.nextInt();
        parent=new int[n];
        in.nextLine();
        for(int i=0;i<n-1;i++)
            parent[i]=in.nextInt();
        System.out.println(work());
    }
    public static int work(){
        int[]dp=new int[n];
        int mx = 0;
        for(int i = 0; i < n - 1; i++) {
            dp[i + 1] = dp[parent[i]] + 1;
            mx = Math.max(mx, dp[i + 1]);
        }
        int d = Math.min(l, mx);
        return Math.min(n, 1+d+(l-d)/2);
        }
}
