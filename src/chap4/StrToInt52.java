package chap4;
import java.util.*;

class Solution52 {
    public int StrToInt(String str) {
    	if(str.length()==0) {return 0;}
    	int num=0,i=0;
    	boolean flag=true;
		if(str.charAt(0)=='-' || str.charAt(0)=='+') {
			if(str.charAt(0)=='-') {flag=false;}
			i++;
		}
    	for(;i<str.length();i++) {
	    	if(str.charAt(i)>='0' && str.charAt(i)<='9') {
	    		num=num*10+str.charAt(i)-'0';
	    	}
	    	else {return 0;}
    	}
    	if(!flag) {num=-num;}
        return num;
    }
}

public class StrToInt52 {
	public static void main(String[] args) {
		String str1="123";
		String str2="+123";
		System.out.println(new Solution52().StrToInt(str1));
		System.out.println(new Solution52().StrToInt(str2));
	}
}
