package chap4;

import java.util.*;
class Solution42 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int sum1=0,sum2=0;
        for(int n:num1) {
        	sum1=sum1^n;
        }
        for(int n:num2) {
        	sum2=sum2^n;
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}

public class FindNumsAppearOnce42 {
	public static void main(String[] args) {
		int sum=0;
		int[] nums= {2,4,3,6,3,2,5,5};
		for(int n:nums) {
			sum=sum^n;
		}
		int i=0;
		while(sum!=0) {
			if(sum%2==1) {break;}
			sum=sum/2;
			i++;
		}
		int[] num1=new int[nums.length];
		int count1=0;
		int[] num2=new int[nums.length];
		int count2=0;
		for(int n:nums) {
			if((n>>i)%2==0) {num1[count1]=n;count1++;}
			else {num2[count2]=n;count2++;}
		}
		new Solution42().FindNumsAppearOnce(nums, num1, num2);
	}
}
