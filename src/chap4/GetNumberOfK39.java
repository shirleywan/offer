package chap4;

class Solution39{
    public int GetNumberOfK(int [] array , int k) {
    	if(array.length==0) {return 0;}
    	int n=array.length/2;
    	while(array[n]!=k) {
    		if(array[n]>k) {n=n/2;}
    		else {n=Math.min(array.length-1, n*3/2);}
    	}
    	int count=0;
    	while((n+1)<array.length) {
    		if(array[n+1]==k) {n=n+1;}
    		else {break;}
    	}
    	while(n-1>=0){
    		if(array[n]==k){count++;n--;}
    		else {break;}
    	}
        return count;
    }
}

public class GetNumberOfK39 {
	public static void main(String[] args) {
		int[] num= {1,2,2,2,3,3,4,5,6};
		int k=6;
		int n=new Solution39().GetNumberOfK(num, k);
		System.out.println(n);
	}
}
