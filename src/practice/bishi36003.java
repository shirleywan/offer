package practice;

import java.util.*;
public class bishi36003 {
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m1,m2,m3,m4,m5;
        for(int i=0;i<n;i++){
        	m1=in.nextInt();
        	m2=in.nextInt();
        	m3=in.nextInt();
        	m4=in.nextInt();
        	m5=in.nextInt();
            if(m1+m2+m3+m4+m5==0){System.out.println(-1);}
            else{
                if((m1+m2+m3+m4+m5)%5==0){
                    System.out.println((m1+m2+m3+m4+m5)/5);
                }
                else{System.out.println(-1);}
            }
        }
	}
}