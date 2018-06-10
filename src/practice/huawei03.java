package practice;

import java.util.*;

public class huawei03 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		char[] str1=new char[str.length()];
		int count=0;
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c:str.toCharArray()){
			if(map.containsKey(c)){map.put(c, map.get(c)+1);}
			else{map.put(c, 1);str1[count]=c;count++;}
		}
		char[] num=new char[count];
		for(int i=0;i<count;i++){
			num[i]=str1[i];
		}
		Arrays.sort(num);
		
		String strnew="";
		int i=1;
		boolean flag=true;
		while(flag){
			for(char c:num){
				if(map.get(c)>=i){strnew=strnew+String.valueOf(c);}
			}
			i++;
			if(strnew.length()==str.length()){flag=false;}
		}
		System.out.println(strnew);
	}

}
