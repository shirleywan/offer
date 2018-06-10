package chap4;

import java.util.ArrayList;
import java.util.Arrays;

import javax.print.attribute.standard.NumberUpSupported;
import javax.xml.crypto.Data;
/**
 * now it's belongs to No.31
 * @author admin
 *
 */
class Solution30 {
    public ArrayList<Integer> MoreThanHalfNum_Solution(int [] array,int k) {
    	ArrayList<Integer> list=new ArrayList<Integer>();
        if(array.length==0) {return list;}
        if(k==0 || array.length<k){return list;}
        int middle=array.length/2;
        int start=0;int end=array.length-1;
        int index=Partition(array,start,end);
        System.out.println(index);
        for(int n:array) {System.out.print(n+",");}System.out.println();
        while(index != k-1) {
        	if(index>k-1) {
        		end=index-1;
        		index=Partition(array, start, end);
        		System.out.println(index);
        		for(int n:array) {System.out.print(n+",");}System.out.println();
        	}
        	else {
        		start=index+1;
        		index=Partition(array, start, end);
        		System.out.println(index);
        		for(int n:array) {System.out.print(n+",");}System.out.println();
        	}
        }
        for(int i=0;i<k;i++){
            list.add(array[i]);
        }
        return list;
    }
    public int Partition(int [] array,int start,int end) {
    	if(array.length==0 || start<0 ||end>=array.length) {return 0;}
    	if(start==end) {return start;}
    	int index=0;
    	swap(array,start,end);//这一步是为了把开始的数字放到最后，表示将小于start的数字放在start前面
    	
    	int small=start-1;
    	for(index=start;index<end;index++) {
    		if(array[index]<array[end]) {
    			small++;
    			if(small !=index) {swap(array, index, small);}
    		}
    	}
    	small++;
    	System.out.println("small:"+small);
    	swap(array, small, end);
    	return small;
    }
    public int RandomInRange(int start,int end) {
    	int n=end-start;
    	return (int)(n*Math.random());
    }
    public void swap(int[] array,int start,int end) {
    	int temp=array[start];
    	array[start]=array[end];
    	array[end]=temp;
    }
    public boolean CheckHalf(int[] array,int result) {
    	int times=0;
    	for(int i=0;i<array.length;i++) {
    		if(array[i]==result) {times++;}
    	}
    	boolean more=true;
    	if(times*2<=array.length) {more=false;}
    	return more;
    }
	/**
	 * another method-based on CheckHalf
	 * @param array
	 * @return
	 */
//	public int MoreThanHalfNum_Solution(int [] array) {
//		int count=0;int c=array[0];
//		for(int i=0;i<array.length;i++) {
//			if(count==0 && i+1<array.length) {c=array[i+1];}
//			if(array[i]==c) {count++;}
//			else {count--;}
//		}
//		if(!CheckHalf(array, c)) {return 0;}
//		return c;
//	}
}
public class MoreThanHalfNum_Solution30 {
	public static void main(String[] args) {
//		int n=new Solution30().RandomInRange(1, 10);
//		System.out.println(n);
		int[] array= {4,5,1,6,2,7,3,8};
		int p=8;
		ArrayList<Integer> list=new Solution30().MoreThanHalfNum_Solution(array,p);
		System.out.println(list);
		
		
//		int m=new Solution30().Partition(array, 0, array.length-1);
//		System.out.println(m);
	}
}
