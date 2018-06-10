package chap2;

public class reOrderArray17 {
    public static void reOrderArray(int [] array) {
        int[] nums=new int[array.length];
        int count=0;
        for(int n:array){
        	if(n%2==1){nums[count]=n;count++;}
        }
        for(int n:array){
        	if(n%2==0){nums[count]=n;count++;}
        }
        for(int i=0;i<nums.length;i++){
        	array[i]=nums[i];
        }
    }
    public static void main(String[] args) {
		int[] array={1,4,3};
		reOrderArray(array);
		for(int n:array){
			System.out.print(n+",");
		}
	}
}
