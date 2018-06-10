package others;

import java.util.HashMap;
import java.util.Map;
import java.util.PrimitiveIterator.OfDouble;

public class themin_wy02 {
	public static int themin(String s) {
		if(s.length()==0) {return 1;}
		int min=s.charAt(0)-'0';
		int count0=0;int count1=0;
		int num=0;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=1;i<10;i++) {
			map.put(i, 0);
		}
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)-'0')<min) {min=s.charAt(i);}
			if((s.charAt(i)-'0')==0) {count0++;}
			if((s.charAt(i)-'0')==1) {count1++;}
			if(map.containsKey((s.charAt(i)-'0'))) {map.put((s.charAt(i)-'0'), 1);}
		}
		int n=10;
		for(int i=1;i<10;i++) {
			if(map.get(i)==0) {if(i<n) {n=i;}}
		}
		System.out.println(map);
		System.out.println(min);
		if(min>1) {return 1;}
		else {
			for(int i=0;i<count1+1;i++) {
				num=num*10+1;
			}
			num=num + (int) Math.pow(10, count0);
		}
		
		return n<num ? n:num;
	}
	public static void main(String[] args) {
		String num="123456789000";
		System.out.println(themin(num));
	}
}
