package practice;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class tengxun04 {
    public static boolean isPalindrome(String x) {
    	if (x==null) return false;
    	int i=0;
    	while(i < x.length()/2) {
    		if(x.charAt(i)!=x.charAt(x.length()-1-i)){return false;}
    		i++;
    	}
    	return true;
    }
    public static List<List> cut(String str,int n,List<List> list){
    	String str1="";
    	for(int i=0;i<str.length()-n;i++){
    		str1=str.replace(str.substring(i, i+n), "");
//    		System.out.println(str1);
        	if(isPalindrome(str1)){
        		List list1=new ArrayList<>();
        		list1.add(str1);list1.add(i+n);

        		if(!list.contains(list1)){
        			list.add(list1);
        		}
        	}
        }
    	return list;
    }
    
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        List<List> list=new ArrayList<List>();
        if(isPalindrome(str)){
        	List list1=new ArrayList<>();
    		list1.add(str);list1.add(0);
        	list.add(list1);
        }
        for(int i=1;i<str.length()-1;i++){
        	cut(str, i, list);
        }
        for(int i=0;i<str.length();i++){
    		List list1=new ArrayList<>();
    		list1.add(String.valueOf((str.charAt(i))));list1.add(i);

        	if(!list.contains(list1)){
        		list.add(list1);
        	}
        }
        System.out.println(list);
        System.out.println(list.size());
	}
}
