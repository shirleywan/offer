package chap4;

import java.util.*;

class Solution43 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
    	ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();       
    	if(sum<3) {return list;}
    	int count=1;
    	int i=1,j=2;
    	while(i<j && j<=(sum/2+1)){
    		if(count+j==sum) {
    			list.add(printitem(i, j));
    		}
    		while(count+j>sum) {
    			count=count-i;
    			i++;
	    		if(count+j==sum) {
	    			list.add(printitem(i, j));
	    		}
    		}
    		count=count+j;j++;
    	}
       return list;
    }
    public ArrayList<Integer> printitem(int i,int j){
    	ArrayList<Integer> list=new ArrayList<Integer>();
    	for(int m=i;m<=j;m++) {
    		list.add(m);
    	}
    	return list;
    }
}

public class FindContinuousSequence43 {
	public static void main(String[] args) {
		int sum=15;
		System.out.println(new Solution43().FindContinuousSequence(sum));
	}
}
