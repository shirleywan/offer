package practice;


import java.util.*;

public class souhu02 {
	public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        ArrayList<String> list=new ArrayList<String>();
        for(int i=0;i<=n;i++){
        	String str=in.nextLine();
        	list.add(str);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
        	char[] c=list.get(i).toCharArray();
        	System.out.println(c[0]-'0');
//        	if((c[0]-'2')==0){
//        		count=count+(c[2]-'0');
//        	}
//        	if((c[0]-'1')==0){
//	        	if((c[2]-'0')>max){
//	        		max=c[2]-'0';
//	        	}
//        	}
        }
//        for(int i=0;i<list.size();i++){
//        	if(list.get(i)[0]=='1'){
//	        	if((list.get(i)[2]-'0')>max){
//	        		max=list.get(i)[2]-'0';
//	        	}
//        	}
//        }
        System.out.println(count);
        
	}
}
