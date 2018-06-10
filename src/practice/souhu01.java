package practice;

import java.util.*;
public class souhu01 {
    public static ArrayList<Integer> number(int [] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(k<0 || k>input.length){return list;}
        for(int i=0;i<k;i++){
            list.add(input[i]);
        }
        return list;
    }
	
    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
        	nums[i]=in.nextInt();
        }
        ArrayList<Integer> list=number(nums,k);
//        System.out.println(list);
        String str="";
        for(int i=0;i<list.size();i++){
        	str=str+String.valueOf(list.get(i))+",";
        }
        System.out.println(str.substring(0, str.length()-1));
	}
}
