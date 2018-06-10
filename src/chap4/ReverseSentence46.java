package chap4;

import java.util.*;

class Solution46 {
    public String ReverseSentence(String str) {
    	if(str==null) {return str;}
    	if(str.split(" ").length==0) {return str;}
    	String str1=reverse(str);
    	String[] strings=str1.split(" ");
    	StringBuilder stringBuilder=new StringBuilder();
    	for(String s:strings) {
    		stringBuilder.append(reverse(s));
    		stringBuilder.append(" ");
    	}
        return stringBuilder.toString().trim();
    }
    public static String reverse(String str) {
    	StringBuilder string=new StringBuilder();
    	for(int i=str.length()-1;i>=0;i--) {
    		string.append(str.charAt(i));
    	}
    	return string.toString();
    }
}

public class ReverseSentence46 {
	public static void main(String[] args) {
		String str=" ";
		System.out.println(new Solution46().ReverseSentence(str));
	}
}
