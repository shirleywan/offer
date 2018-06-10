package chap4;

import java.util.*;

public class sumEqualS43 {
	public static List<List<Integer>> sumEqualS(int[] nums, int sum){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i=0,j=nums.length-1;i<j;) {
			if(nums[i]+nums[j]==sum) {
				List<Integer> list1 = new ArrayList<Integer>();
				list1.add(nums[i]);list1.add(nums[j]);
				list.add(list1);
				i++;
			}
			else {
				if(nums[i]+nums[j]>sum) {j--;}
				else {i++;}
			}
		}
		return list;
	}
	public static void main(String[] args) {
		int[] nums= {2,7,6,4,3};
		int sum=10;
		System.out.println(sumEqualS(nums, sum));
	}
}
