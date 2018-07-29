package chap4;

import java.awt.MenuComponent;
import java.util.*;

class Solution57 {
	Map<Character, Integer> map=new HashMap<Character,Integer>(); 
	List<Character> list=new ArrayList<Character>();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(map.containsKey(ch)){map.put(ch, map.get(ch)+1);}
        else{
        	map.put(ch, 0);
        }
        list.add(ch);
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    	int temp=Integer.MAX_VALUE;
    	for(int i=0;i<list.size()-1;i++){
    		if(map.get(list.get(i))==0){
    			return list.get(i);
    		}
    	}
    	return '#';
    }
}
//class Solution57 {
//	int[] hashtable=new int[256];
//	StringBuffer s=new StringBuffer();
//	//Insert one char from stringstream
//	public void Insert(char ch)
//	{
//		s.append(ch);
//		if(hashtable[ch]==0)
//			hashtable[ch]=1;
//		else hashtable[ch] += 1 ;
//    }
//	//return the first appearence once char in current stringstream
//	public char FirstAppearingOnce(){
//		char[] str=s.toString().toCharArray();
//		for(char c:str){
//			if(hashtable[c]==1)
//				return c;
//		}
//		return '#';
//    }
//}
public class FirstAppearingOnce57 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int num=in.nextInt();
//		new Solution57().FirstAppearingOnce();
		char[] ch=s.toCharArray();
		for(char c:ch){
			
		}
	}
}
