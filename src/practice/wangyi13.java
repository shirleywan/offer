package practice;

import java.util.Scanner;

public class wangyi13 {
	public static boolean test(String str){
		int num = Integer.valueOf(str).intValue();
		if(num%3==0) {return true;}
		return false;
	}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt(); 
        String str1="";
        int count=0;
        for(int i=1;i<n;i++){
        	str1 += String.valueOf(i);
        }
    	if(test(str1)){count++;}
        for(int i=n;i<=m;i++){
        	str1 += String.valueOf(i);
        	if(test(str1)){count++;}
        }
        System.out.println(count);
    }
}
