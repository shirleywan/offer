package practice;

import java.util.Scanner;

public class tengxun01 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        int x=in.nextInt();
        int a=in.nextInt();
        int y=in.nextInt();
        int b=in.nextInt();
        int i=0,j=0;
        int sum1=1,sum2=1,sum3=1;
        int count=0,count1=0;
        for(i=0;i<=x;i++){
        	for(j=0;j<=y;j++){
        		if(i*a+y*b==k){
        			count1++;
        			for(int p=1;p<=x;p++){sum1=sum1*p;}
        			for(int q=1;q<=i;q++){sum2=sum2*q;}
        			for(int m=1;m<=(x-i);m++){sum3=sum3*m;}
        			count1=(count1*sum1)/(sum2*sum3);
        			count=count+count1;
        		}
        	}
        }
        System.out.println(count);
	}
}
