package practice;
/**
 * 找到数组中第二大的数字
 * @author admin
 *
 */
public class secondNum {
	/**
	 * 这种方法可以满足：数组中最大字符有2个
	 */
	public static int secondNum(int[] nums) {
		if(nums.length==0) {return 0;}
		int count=nums[0];
		int m=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>count) {count=nums[i];m=i;}
		}
		nums[m]=nums[0];
		nums[0]=count;
		count=nums[1];
		for(int i=1;i<nums.length;i++) {
			if(nums[i]>count) {count=nums[i];m=i;}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] num= {5,3,6,8,4,2,9};
		System.out.println(secondNum(num));
	}
}
