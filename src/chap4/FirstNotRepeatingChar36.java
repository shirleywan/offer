package chap4;

import java.util.*;

public class FirstNotRepeatingChar36 {
	public static int FirstNotRepeatingChar(String str) {
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(char c:str.toCharArray()){
            if(map.containsKey(c)){map.put(c,map.get(c)+1);}
            else{map.put(c,1);}
        }
        int i=0;
        for(i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){break;}
        }
        return i;
	}
	public static void main(String[] args) {
		String s="11222334";
		System.out.println(FirstNotRepeatingChar(s));
	}
}
