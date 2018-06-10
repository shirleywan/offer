package others;
import java.util.*;

public class wangyi06 {
	public static int findLCS(String s) {
		char[] str=s.toCharArray();String num;String m;
		Set set=new HashSet();
		set.add(s);
		for(int i=0;i<s.length();i++) {
//			num=s.substring(i+1, s.length());
//			System.out.println(num);
			char c=s.charAt(i);
			if(i==0) {num=s.substring(i+1, s.length());}
			else {
				if(i==s.length()-1) {num=s.substring(0, i);}
				else{num=s.substring(0, i)+s.substring(i+1, s.length());}
			}
			
			for(int j=0;j<num.length();j++) {
				m=num.substring(0,j+1)+c+num.substring(j+1, num.length());
//				System.out.println(m);
				if(compare(m)) {if(!set.contains(m)) set.add(m);}
			}
		}
		return set.size()-1;
	}
	public static boolean compare(String s) {
		Stack temp=new Stack();
		for(char c:s.toCharArray()) {
			if(c=='(') {temp.push(c);}
			if(c==')') {
				if(!temp.empty()) {temp.pop();}
				else {return false;}
			}
		}
		return temp.empty();
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
//		String s="(())()";
		int i=findLCS(s);
		System.out.println(i);
//		System.out.println(list);
	}
}
