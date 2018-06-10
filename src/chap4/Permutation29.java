package chap4;
import java.util.ArrayList;
class Solution29 {
    public ArrayList<String> Permutation(String str) {
    	ArrayList<String> list =new ArrayList<String>();
        if(str.length()==0){return list;}
        char[] num=str.toCharArray();
        add(num,0,list);
        return list;
    }
    public void add(char[] str,int n,ArrayList<String> list){
        if(n==str.length){
        	if(!list.contains(String.valueOf(str))) {list.add(String.valueOf(str));}
        }
        else{
            for(int i=n;i<str.length;i++){
                char temp=str[i];
                str[i]=str[n];
                str[n]=temp;
                
                add(str,n+1,list);
                temp=str[i];
                str[i]=str[n];
                str[n]=temp;
            }
        }
    }
}

public class Permutation29 {
	public static void main(String[] args) {
		String str="abc";
		ArrayList<String> list=new Solution29().Permutation(str);
		System.out.println(list);
	}
}
