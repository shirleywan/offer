package practice;

import java.util.*;
public class xiecheng02 {
    
  public static void main(String[] args) {  
      
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt(); 
		int count=0;
       if(n<100 || m>999) { System.out.println("no");}
      for (int i = n; i <=m ; i++) {  
          int firstNum = i/100;  
          int secondNum = i/10%10;  
          int thirdNum = i%10;  
          if(firstNum*firstNum*firstNum + secondNum*secondNum*secondNum+thirdNum*thirdNum*thirdNum == i){  
              count++;
              System.out.print(i+" ");  
          }
      }  
      if(count==0){System.out.println("no");  }
  } 

}