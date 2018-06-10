package practice;
/**
 * aliyimian
 */
import java.lang.reflect.Array;
import java.util.*;
public class bishi0001 {
	public static void main(String[] args) {
		int[] nums={8,15,6,1};
		int n=16;
		if(nums.length<2){System.out.println(-1);}
		int p=0,q=0;
		int count=Math.abs(nums[0]+nums[1]-n);
		Arrays.sort(nums);
		for(int i=0,j=nums.length-1;i<j;){
			if(Math.abs(nums[i]+nums[j]-n)<count){count=Math.abs(nums[i]+nums[j]-n);p=i;q=j;}
			else{
				if(nums[i]+nums[j]-n<0){i++;}
				else{j--;}
			}
		}
		System.out.println(nums[p]+","+nums[q]);
		
	}
}
