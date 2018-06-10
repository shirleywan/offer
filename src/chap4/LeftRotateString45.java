package chap4;
import java.util.*;

class Solution45 {
    public String LeftRotateString(String str,int n) {
    	if(str==null) {return "";}
    	if(str==" "||str=="") {return str;}
    	if(str.length()<=n) {return str;}
    	String str1=reverse(str.substring(0, n));
    	String str2=reverse(str.substring(n, str.length()));
    	StringBuilder string=new StringBuilder();
    	string.append(str1);string.append(str2);
    	
        return reverse(string.toString());
    }
    public static String reverse(String str) {
    	StringBuilder string=new StringBuilder();
    	for(int i=str.length()-1;i>=0;i--) {
    		string.append(str.charAt(i));
    	}
    	return string.toString();
    }
}

public class LeftRotateString45 {
	public static void main(String[] args) {
		String str="";
		int n=2;
		System.out.println(new Solution45().LeftRotateString(str,n));
	}
}
