package others;

import java.util.Scanner;

public class wangyi03 {
	public static float average(String s) {
		if(s.length()==0) {return 0;}
		int count=0;char c=s.charAt(0);
		int part=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=c) {c=s.charAt(i);part++;}
		}
		part++;
		return (float)s.length()/(float)part;
	} 
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine();
//		String str="aaabbbccaaabc";
		System.out.println(String.format("%.2f", average(str)));
	}
}
