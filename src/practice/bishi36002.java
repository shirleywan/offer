package practice;

import java.util.*;
public class bishi36002 {
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=0;
        for(int i=0;i<n;i++){
        	m=in.nextInt();
        	int[] num=new int[2*m];
        	for(int j=0;j<2*m;j++){
        		num[j]=in.nextInt();
        	}
        	Arrays.sort(num);
        	if(num[num.length/2-1]<num[num.length/2]){
        		System.out.println("YES");
        	}
        	else{
        		System.out.println("NO");
        	}
        }
	}
}