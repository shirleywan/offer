package practice;

import java.util.*;
public class xiecheng01 {
//	public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        int n=in.nextInt();
//        int m=in.nextInt(); 
//	}

	    public static void main(String args[]){
	        int m;
	        double sum,n;
	        Scanner sc = new Scanner(System.in);
	        while(sc.hasNext()){
	            n=sc.nextInt();
	            m=sc.nextInt();
	            sum=0;
	            for(int i=0;i<m;i++){
	                sum=sum+n;
	                n=Math.sqrt(n);
	            }
	            System.out.printf("%.2f",sum);
	            System.out.println();
	        }
	    }
}
