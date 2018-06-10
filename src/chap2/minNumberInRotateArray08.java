package chap2;

public class minNumberInRotateArray08 {
    public static int minNumberInRotateArray(int [] array) {
    	if(array.length==0){return 0;}
    	int i=0,j=array.length-1;
    	int mid=0;
    	while(array[i]>=array[j]){
    		if(j-i==1){mid=j;break;}
    		if(j%2==1){mid=(j-1)/2;}
    		else{mid=(i+j)/2;}
    		if(array[i]<=array[mid]){i=mid;}
    		else{if(array[j]>=array[mid]){j=mid;}}//这里用if..else，每次i、j指针只变化一次
    	}
    	return array[mid];
    }
    public static void main(String[] args) {
		int[] array={3,4,5,6,1,2};
		int a=minNumberInRotateArray(array);
		System.out.println(a);
	}
}
