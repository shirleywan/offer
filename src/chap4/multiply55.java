package chap4;

import java.util.*;
class Solution55 {
	//O(n^2)复杂度
    public int[] multiply1(int[] A) {
    	if(A==null || A.length==0) {return null;}
    	int[] B = new int[A.length];
    	for(int i=0;i<B.length;i++) {B[i]=1;}
    	for(int i=0;i<A.length;i++) {
    		for(int j=0;j<B.length;j++) {
    			if(i==j) continue;
    			else {
    				B[j]=B[j]*A[i];
    			}
    		}
    	}
    	return B;
    }

    public int[] multiply(int[] A) {  
        // 将 B 拆分为 A[0] *...* A[i-1] 和 A[n-1]*...*A[i+1] 两部分  
        if (A == null || A.length == 0)  
            return A;  
        int len = A.length;  
        int[] B = new int[len];  
        B[0] = 1;  
        // 先计算左下三角形，此时 B[0] 只有一个元素，舍为 1，  
        // B[0] 不包括 A[0]  
        for (int i = 1; i <len; i++)  
            B[i] = B[i - 1] * A[i - 1];  
        // 只需要保留上一个计算结果，不需要数组保存  
        int tmp = 1;  
          
        /* 
         * for (int i = len - 2; i>= 0; i--) {  
         *  tmp *= A[i+ 1];  
         *  B[i] *= tmp; } 
         */  
        // 计算右上三角形  
        for (int i = len - 1; i >= 0; i--) {  
            // B[i] 最终结果是左侧和右侧的乘积  
            B[i] *= tmp;  
            tmp *= A[i];  
        }  
        System.out.println(Arrays.toString(B)); //注意这种输出数组的方法
        return B;  
    }  

}

public class multiply55 {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		int[] numbers=new Solution55().multiply(nums);
		for(int n:numbers) {
			System.out.println(n);
		}
	}
}
