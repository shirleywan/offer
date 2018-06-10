package chap2;

public class NumberOf113 {
    public static int NumberOf1(int n) {
        int count=0;
        while(n!=0){
            count++;
            n=(n-1)&n;
        }
        return count;
    }
    public static void main(String[] args) {
		int n=10;
		System.out.println(NumberOf1(n));
	}
}
