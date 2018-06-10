//package practice;
//
//import java.math.BigInteger;
//import java.util.*;
//
////public class meituan01 {
//////	public static int test(int n){
//////		StringBuffer s=new StringBuffer();
//////		for(int i=1;i<=n;i++){
//////			s.append(i);
//////		}
//////		return s.length();
//////	}
//////	public static void main(String[] args) {
//////		 Scanner in=new Scanner(System.in);
//////		 BigInteger n=in.nextBigInteger();
//////		 BigInteger i=BigInteger.valueOf(1);
//////	     while(!i.equals(n)){
//////	    	 int m=in.nextInt();
//////	    	 System.out.println(test(m));
//////	    	 i.add(BigInteger.valueOf(1));
//////	     }
//////	        
//////	}
////	public static int test(char[] nums){
//////		StringBuffer s=new StringBuffer();
//////		BigInteger i=BigInteger.valueOf(1);
//////		while(!i.equals(n)){
//////			s.append(String.valueOf(i));
//////			i.add(BigInteger.valueOf(1));
//////		}
////		int count=0;
////		int n=nums.length;
////		int m=0;
////		while(m<n){
////			nums[m]*n;
////		}
////		return s.length();
////	}
////	public static void main(String[] args) {
////        Scanner in=new Scanner(System.in);
////        int n=in.nextInt();
////        for(int i=0;i<n;i++){
////        	String m=in.nextLine();
////        	char[] c=m.toCharArray();
////        	System.out.println(test(m));
////        }
////	}
//////    public void PrintMaxOfNdigits(int[] number,int length,int index){
//////        if(index ==length-1){
//////            PrintNumber(number);
//////            return;
//////        }
//////        for(int i=0;i<10;i++){
//////            number[index+1]=i;
//////            PrintMaxOfNdigits(number, length, index+1);
//////        }
//////    }
//////    
//////    public void Test1(int n){
//////        if(n<=0)
//////            return;
//////        int[] number = new int[n];
//////        for(int i=0;i<10;i++){
//////            number[0]=i;
//////            PrintMaxOfNdigits(number, n, 0);
//////        }
//////    }
////}
//
//public class meituan01 {
//	public static int test(String m) {
//		int[] result=new int[];
//		StringBuffer s=new StringBuffer();
//		int i=0;
//		while(i<m)
//		return s.length();
//	}
//	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		int n=in.nextInt();
//		for(int i=0;i<n;i++){
//			String m=in.nextLine();
////			char[] c=m.toCharArray();
//			System.out.println(test(m));
//  }
//}
//}
