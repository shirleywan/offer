package chap4;
import java.util.*;

class Solution53 {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int[] numbers,int length,int [] duplication) {
    	if(numbers==null || numbers.length==0 || length<=0) {return false;}
    	for(int i=0;i<length-1;i++) {
    		if(numbers[i]<0 || numbers[i]>=length) {return false;}
    	}
    	Arrays.sort(numbers);
    	for(int i=0;i<length-1;i++) {
    		if(numbers[i]==numbers[i+1]) {duplication[0]=numbers[i];return true;}
    	}
    	return false;
    }
}

public class duplicate53 {
	public static void main(String[] args) {
		int[] nums={2,3,1,0,2,5,3};
		int[] count=new int[1];
		new Solution53().duplicate(nums, nums.length, count);
		System.out.println(count[0]);
	}
}
