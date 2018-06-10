package chap4;
import java.util.*;
public class GetUglyNumber_Solution35 {
//	public static int uglyNumber(int index) {
//        Queue<Integer> queue=new LinkedList<Integer>();
//        List<Integer> list = new ArrayList<Integer>();
//        queue.add(2);queue.add(3);queue.add(5);
//        list.add(1);list.add(2);list.add(3);list.add(5);
//        while(list.size()<index+1) {
//        	int num=queue.peek();
//        	if(!list.contains(num*2)) {list.add(Math.abs(num*2));queue.add(Math.abs(num*2));}
//        	if(!list.contains(num*3)) {list.add(Math.abs(num*3));queue.add(Math.abs(num*3));}
//        	if(!list.contains(num*5)) {list.add(Math.abs(num*5));queue.add(Math.abs(num*5));}
//        	queue.poll();
//        }
//        list.sort(null);
//        System.out.println(list);
//		return list.get(index-1);
//	}
	public static int uglyNumber(int index) {
        List<Integer> uglys=new ArrayList<Integer>();  
        uglys.add(1);  
        int p2=0;  
        int p3=0;  
        int p5=0;  
        for(int i=1;i<index;i++){  
            int lastNumber=uglys.get(uglys.size()-1);  
            while(uglys.get(p2)*2<=lastNumber){  
                p2++;  
            }  
            while(uglys.get(p3)*3<=lastNumber){  
                p3++;  
            }  
            while(uglys.get(p5)*5<=lastNumber){  
                p5++;  
            }  
            int newValue=Math.min(uglys.get(p2)*2, Math.min(uglys.get(p3)*3, uglys.get(p5)*5));  
            uglys.add(newValue);  
        }  
        return uglys.get(uglys.size()-1);  
	}
	public static void main(String[] args) {
		int num=1500;
		System.out.println(uglyNumber(num));
	}
}
