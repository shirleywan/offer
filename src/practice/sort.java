package practice;

import java.net.Inet4Address;
import java.util.Random;

public class sort {
	public static int partition(int data[],int start,int end) {
		if(data.length==0 || start>end){
			throw new IllegalArgumentException("Invalid args: 前序/中序数组有问题");
		}
		
		int index=(int)(Math.random()*(end-start)+start);
		swap(data[index],data[end]);
		int small=start-1;
		for(index=start;index<end;index++){
			if(data[index]<data[end]){
				small++;
				if(small !=index){swap(data[index], data[small]);}
			}
		}
		small++;
		swap(data[small], data[small]);
		return 0;
	}
	public static void swap(int a,int b){
		int temp=0;
		temp=a;a=b;b=temp;
	}
	public static void QuickSort(int[] data,int start,int end){
		int index = partition(data, start, end);
		if(data[index]>data[start]){QuickSort(data, start, index-1);}
		if(data[index]<data[end]){QuickSort(data, index+1, end);}
	}
	public static void main(String[] args) {
		int[] data={10,3,6};
		QuickSort(data,0,data.length-1);
		for(int num:data){System.out.print(num+" ");}
	}
}
