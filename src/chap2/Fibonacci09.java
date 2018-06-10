package chap2;

public class Fibonacci09 {
//    public static int Fibonacci(int n) {
//    	if(n==1 || n==2){return 1;}
//    	int sum=0;
//    	sum=Fibonacci(n-1)+Fibonacci(n-2);
//    	return sum;
//    }
//    public static int Fibonacci(int n) {
//    	if(n==0){return 0;}
//        if(n==1){return 1;}
//    	return Fibonacci(n-1)+Fibonacci(n-2);
//    }
	public static int Fibonacci(int n){
		int[] result={0,1};
		if(n<2){return result[n];}
		
		int one=0;int zero=1;int sum=0;
		for(int i=1;i<=n;i++){
			sum=one+zero;
			one=zero;
			zero=sum;
		}
		return sum;
	}
    public static void main(String[] args) {
		int n=3;
		System.out.println(Fibonacci(n));
	}
}
