package practice;

import java.util.HashMap;
import java.util.*;
/**
 * 58同城
 * @author Administrator
 *
 */
public class bishi003 {
	public static int work(String s){
		int n=s.length();
		int ans=0;
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<=n;j++){
				if(test(s, i, j)) {ans=Math.max(ans, j-i);}
			}
		}
		return ans;
	}
	public static boolean test(String s,int start,int end){
		Map map=new HashMap();
		for(int i=start;i<end;i++){
			char c=s.charAt(i);
			if(map.containsKey(c)){return false;}
			map.put(c, 0);
		}
		return true;
	}
    public static int testnew(String s) {
        int n = s.length();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),0);
                j++;
                ans = Math.max(ans, j-i);
            }
            else {
                map.remove(s.charAt(i));
                i++;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		String s="aaa";
		System.out.println(testnew(s));
	}
}
