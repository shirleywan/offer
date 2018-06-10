package practice;
import java.util.*;

//public class wangyi01 {
//	
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); 
//        String str = sc.nextLine();
//        int num = Integer.valueOf(str).intValue();
////	    String s=machine(num);
////	    System.out.println(s);
//        
//	}
//
//}
import java.util.Scanner;
public class wangyi01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}