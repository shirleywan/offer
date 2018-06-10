package chap4;

import java.util.*;
class Solution50 {
    public int Add(int num1,int num2) {
    	int sum,count;
    	do {
    		sum=num1 ^ num2;
        	count=(num1 & num2)<<1;
        	num1 = sum;
        	num2 = count;
    	}
    	while(num2!=0);
    	return num1;
    }
    public int Add1(int num1,int num2) {
    	int sum,count;
    	sum=num1 ^ num2;
    	count=(num1 & num2)<<1;
    	return sum+count;
    }
}
public class Add50 {
	public static void main(String[] args) {
		int n1=1;
		int n2=8;
		System.out.println(new Solution50().Add1(n1, n2));
	}
}
