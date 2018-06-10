package practice;

import java.util.*;

public class wangyi12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();//work
        int[] work=new int[n];
        int[] pay=new int[n];
        int m=in.nextInt(); //小伙伴个数
        for(int i=0;i<n;i++) {
            work[i]=in.nextInt();
            pay[i]=in.nextInt();  
        }
        
        int[] num=new int[m];
        for(int i=0;i<m;i++) {
            num[i]=in.nextInt();
        }
        int max=0;
        for(int c:num){
        	max=0;
        	if(c>=work[n-1]){
    			for(int j=0;j<=n-1;j++){
    				if(pay[j]>max){max=pay[j];}
    			}
    			System.out.println(max);
        	}
        	else{
	        	for(int i=0;i<n-1;i++){
	        		if(c>=work[i] && c<work[i+1]){
	        			for(int j=0;j<=i;j++){
	        				if(pay[j]>max){max=pay[j];}
	        			}
	        			System.out.println(max);
	        		}
	        	}
        	}
        }

    }
}
