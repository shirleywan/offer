package others;

import java.util.Scanner;

public class wangyi01 {
    public static String machine(int num){
        String s="";
        if(num%2==0){s=convert((num-2)/2,s+"2");}
        else{s=convert((num-1)/2,s+"1");}
//        System.out.println(s);
        s=reverse(s);
        return s;
    }
    public static String convert(int num,String s){
//    	System.out.println(s);
        if(num==0) return s;
        if(num%2==0){s=convert((num-2)/2,s+"2");}
        else{s=convert((num-1)/2,s+"1");}
        return s;
    }
    public static String reverse(String s){
    	char[] str=s.toCharArray();
    	char temp;
        for(int i=0;i<=(s.length()-1)/2;i++){
            temp=str[i];
            str[i]=str[s.length()-1-i];
            str[s.length()-1-i]=temp;
        }
        return String.copyValueOf(str);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine();
        int num = Integer.valueOf(str).intValue();
        System.out.println(num);
		String s=machine(num);
		System.out.println(s);
	}
}
