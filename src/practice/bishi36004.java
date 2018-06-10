package practice;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
public class bishi36004 {
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        if(n<k){System.out.println(0);}
        int num1=1;
        int num2=1;
        for(int i=1;i<=n;i++){
        	num1 =num1*i;
        }
        for(int i=1;i<=(n-k);i++){
        	num2 =num2*i;
        }
        System.out.println((num1/num2)%772235);
	}
}
