package chap4;

import java.util.*;
class Solution44 {
    public ArrayList<Integer> FindNumbersWithSum(int[] nums,int sum) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0,j=nums.length-1;i<j;) {
			if(nums[i]+nums[j]==sum) {
				list.add(nums[i]);list.add(nums[j]);break;
			}
			else {
				if(nums[i]+nums[j]>sum) {j--;}
				else {i++;}
			}
		}
        return list;
    }
}
public class FindNumbersWithSum44 {
	public static void main(String[] args) {
		int[] nums= {1,2,4,7,11,15};
		int sum=15;
		System.out.println(new Solution44().FindNumbersWithSum(nums, sum));
	}
}
