package practice;

import java.util.Arrays;
import java.util.Scanner;

public class bishi3602 {
	public static int work(int r,int g,int b) {
		int[] num=new int[3];
		int count=0;
		num[0]=r;num[1]=g;num[2]=b;
		Arrays.sort(num);
		while((num[0]+num[1]+num[2]>=3)&&(num[0]!=0&&num[1]!=0)){
			Arrays.sort(num);
			if(num[2]>=2){num[2]-=2;num[1]-=1;}
			else{num[2]-=1;num[1]-=1;num[0]-=1;}
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int r,g,b;
        for(int i=0;i<n;i++){
        	r=in.nextInt();
        	g=in.nextInt();
        	b=in.nextInt();
        	System.out.println(work(r,g,b));
        }
	}
}
