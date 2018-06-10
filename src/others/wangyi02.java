package others;

import java.util.Scanner;

public class wangyi02 {
	public static int number(int num) {
		String s=String.valueOf(num);
		char[] nums=s.toCharArray();
		for(int i=0;i <=(nums.length-1)/2 ;i++) {
			char temp=nums[i];
			nums[i]=nums[nums.length-i-1];
			nums[nums.length-i-1]=temp;
		}
		s=String.valueOf(nums);
		int num1=Integer.valueOf(s).intValue();
		return num1+num;
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine();
        int num = Integer.valueOf(str).intValue();
		System.out.println(number(num));
	}
}
