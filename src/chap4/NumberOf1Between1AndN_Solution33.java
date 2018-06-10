package chap4;

class Solution33{
	public int NumberOf1Between1AndN_Solution33(int num) {
		int count=0;
		while(num%10!=0) {count++;num=num/10;}
		while(count>0) {
			
		}
		System.out.println(count);
		return 0;
	}
}

public class NumberOf1Between1AndN_Solution33 {
	public static void main(String[] args) {
		int num=123456;
		int n=new Solution33().NumberOf1Between1AndN_Solution33(num);
		System.out.println(n);
	}
}

