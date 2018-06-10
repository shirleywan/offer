package practice;

import java.util.Scanner;

public class bishi36001 {
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x1;int y1;int x2;int y2;int count=0;
        for(int i=0;i<n;i++){
        	int m=in.nextInt();
        	count=0;
        	for(int j=0;j<m;j++){
            	x1=in.nextInt();
            	y1=in.nextInt();
            	x2=in.nextInt();
            	y2=in.nextInt();
            	count=count+(x2-x1+1)*(y2-y1+1);
        	}
        	System.out.println(count);
        }
	}
}
