package practice;

import java.util.*;
import java.util.Scanner;

public class alimoni {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int f1=in.nextInt();
		int f2=in.nextInt();
		int f3=in.nextInt();
		int f4=in.nextInt();
		int f5=in.nextInt();
		int N=in.nextInt();
		float p1=in.nextFloat();
		float p2=in.nextFloat();
		float p3=in.nextFloat();
		float p4=in.nextFloat();
		float p5=in.nextFloat();

		float[] nums=new float[5];
		nums[0]=N/(f1*p1);
		nums[1]=N/(f2*p2);
		nums[2]=N/(f3*p3);
		nums[3]=N/(f4*p4);
		nums[4]=N/(f5*p5);
		Arrays.sort(nums);
		System.out.println((int)Math.floor(nums[0]));
	}
}
