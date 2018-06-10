package chap4;

import java.util.*;
class Solution47 {
    public boolean isContinuous(int [] numbers) {
    	if(numbers.length==0) {return false;}//[]
    	Arrays.sort(numbers);
    	int count=0,sum=0;
    	for(int i=0;i<numbers.length-1;i++) {
    		if(numbers[i]==0) {count++;continue;}
    		else {
    			sum=sum+Math.abs(numbers[i+1]-numbers[i])-1;
    		}
    	}
    	System.out.println(count);
    	System.out.println(sum);
    	if(sum<=count && sum>=0) {return true;}
    	return false;
    	
    }
}

public class isContinuous47 {
	/**
	 * 生成n个范围在0-(m+1)之间的随机数
	 */
	public static SortedSet<Integer> randomSet(int n,int m) {
		Random ran=new Random();
		SortedSet<Integer> set=new TreeSet<Integer>();
		while(set.size()<n) {
			set.add(ran.nextInt(m+1));
		}
		return set;
	}
	public static void main(String[] args) {
//		int n=5; //生成5个数字
//		int m=13; //范围在0-13之间
//		SortedSet<Integer> set=randomSet(n, m);
//		int[] nums=new int[n];
//		int count=0;
//		for(int p:set) {
//			nums[count]=p;
//		}
		int[] nums= {}; //1,0,0,1,0
		System.out.println(new Solution47().isContinuous(nums));
	}
}
