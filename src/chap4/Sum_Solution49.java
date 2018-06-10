package chap4;
import java.util.*;

class Solution49 {  
    public int Sum_Solution1(int n) {  
        int sum = n;  
        boolean flag = (sum> 0) && ((sum += Sum_Solution1(n - 1)) > 0);
        	//一直计算前后的算式，直到sum=0，使用逻辑与的短路特性，前面为false，则后面不考虑，停止后面的递归，反馈；
        return sum;  
    }
    
    public int Sum_Solution2(int n) {  
        int sum = n;  
        boolean flag = (n == 0) || ((sum += Sum_Solution2(n - 1)) > 0);
        	//一直计算后面的递归，直到n=0，使用逻辑或的短路特性，前面为true则后面不考虑，
        	//前面为false一定计算后面，停止后面的递归；
        return sum;  
    }
}  

public class Sum_Solution49 {
	public static void main(String[] args) {
		int n=100;
		System.out.println(new Solution49().Sum_Solution1(n));
		System.out.println();
		System.out.println(new Solution49().Sum_Solution2(n));
	}
}
