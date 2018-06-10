package chap4;

import java.util.Stack;

import chap2.stackQueue07;

class Solution25 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
    	if(pushA.length==0 || popA.length==0) {return false;}
    	Stack<Integer> stack1=new Stack<Integer>();
    	int i=0,j=0;
    	while(i<pushA.length && j<popA.length){
    		if(pushA[i]==popA[j]) {
    			if(i+1<pushA.length) {i++;j++;continue;}
    			else {j++;continue;}
    		}
    		if(!stack1.isEmpty()&&popA[j]==stack1.peek()) {stack1.pop();j++;continue;}
    		else {stack1.push(pushA[i]);i++;}
    	}
        return stack1.isEmpty();
    }
}

public class IsPopOrder25 {
	public static void main(String[] args) {
		int[] num= {};
		int[] list= {};
		boolean flag=new Solution25().IsPopOrder(num, list);
		System.out.println(flag);
	}

	
}
