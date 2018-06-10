package practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class EdgeS{
	char from,to;
	int w;
	public EdgeS(char f,char t,int w){
		from=f;
		to=t;
		this.w=w;
	}
}
public class xiecheng03 {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码******************************/
   static boolean[] visit;
   static boolean[] onStack;
   static Stack<Character> stack;
   static int n,m;
   static boolean cycle=false;
   static int[] dis;
   static int INF=99999999;
   static ArrayList<EdgeS>[] adj;

	static int calculate(int M, String[] strs) {
    	

    	return 0;
    }
/******************************结束写代码******************************/


//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int res;
//            
//        int _M;
//        _M = Integer.parseInt(in.nextLine().trim());
//        
//        int _strs_size = _M;
//        String[] _strs = new String[_strs_size];
//        String _strs_item;
//        for(int _strs_i = 0; _strs_i < _strs_size; _strs_i++) {
//            try {
//                _strs_item = in.nextLine();
//            } catch (Exception e) {
//                _strs_item = null;
//            }
//            _strs[_strs_i] = _strs_item;
//        }
//  
//        res = calculate(_M, _strs);
//        System.out.println(String.valueOf(res));    
//
//    }
    public static void main(String[] args){
    	 Scanner in = new Scanner(System.in);
    	 m=in.nextInt();
//    	 m=in.nextInt();
    	 visit=new boolean[6];
    	 adj=new ArrayList[6];
    	 stack=new Stack();
    	 dis=new int[6];
    	 onStack=new boolean[6];
    	 for(int i=1;i<=5;i++){ adj[i]=new ArrayList<>(); }
    	 for(int i=0;i<m;i++){
    		 String s=in.nextLine();
    		 char[] c=s.toCharArray();
    		 int j=0;
    		 while(j+2<c.length){
	    		 char from=c[j+0];
	    		 char to=c[j+2];
	    		 int w=c[j+1];
	    		 adj[from].add(new EdgeS(from, to, w));
	    		 j=j+2;
    		 }
    	 }
    	 distance('A');
    	 if(!cycle){
    		 shortPath(1);
    		 System.out.println(dis[3]);
    	 }
    	 else{System.out.println(-1);}
    }
    public static void shortPath(int a){
    	for(int i=1;i<=n;i++){
    		dis[i]=-INF;
    	}
    	dis[a]=0;
    	while(!stack.isEmpty()){
    		int cur=stack.pop();
    		for(EdgeS e:adj[cur]){
    			if(dis[e.to] < dis[cur]+e.w){
    				dis[e.to]=dis[cur]+e.w;
    			}
    		}
    	}
    }
    
    public static void distance(char cur){
    	visit[cur]=true;
    	onStack[cur]=true;
    	for(EdgeS e:adj[cur]){
    		if(!visit[e.to]){distance(e.to);}
    		else{
    			if(onStack[e.to]){
    				cycle=true;return;
    			}
    		}
    		onStack[cur]=false;
    		stack.push(cur);
    	}
    }
}

