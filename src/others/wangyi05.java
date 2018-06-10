package others;

import java.util.Scanner;

public class wangyi05 {
	public static boolean rearray(int[] num) {
		int count4=0;int count2=0;int m=num.length;
		for(int n:num) {
			if(n%4==0) {count4++;}
			if(n%2==0 && n%4!=0) {count2++;}
		}
		if(count2==1) {
			if(count4>=m/2) {return true;}
		}
		else {
			if(count4>=(m-count2+1)/2) {return true;}
		}
		return false;
	} 
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        for(int i=0;i<m;i++) {
            int n=in.nextInt();
            int[] num=new int[n];
            for(int p=0;
            		p<n;p++) {
            	num[p]=in.nextInt();
            }
            if(rearray(num)) {System.out.println("Yes");}
            else {System.out.println("No");}
        }
//		int[] num1= {1,10,100};
//		int[] num2= {1,2,3,4};
	}
	
}
