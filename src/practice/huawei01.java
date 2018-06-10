package practice;

import java.util.*;
public class huawei01 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        String str2=in.nextLine();
        String st=work(str1,str2);
        System.out.println(st);
	}
	public static String work(String str1,String str2){
		int n1=str1.length();
		int n2=str2.length();
		int length=(n1+1)*(n2+1);
		int[] num=new int[length]; //逆序对
		int[] num1=new int[n1];
		int[] num2=new int[n2];
		
//		if((n1==0) ||(n2==0)){return null;}
		for(int i=0;i<length;i++){num[i]=0;}
		for(int i=0;i<n1;i++){
			num1[i]=str1.charAt(n1-1-i)-'0';
		}
		for(int i=0;i<n2;i++){
			num2[i]=str2.charAt(n2-1-i)-'0';
		}
		for(int i=0;i<n1;i++){
			for(int j=0;j<n2;j++){
				int temp=num[i+j]+num1[i]*num2[j];
				num[i+j]=temp%10;
				int o=temp/10;
				int x=i+j+1;
				while(o!=0){
					num[x]=num[x]+o%10;
					o=o/10;
					x++;
				}
			}
		}
		int count=0;
		while(length -->0){
			if(num[length]!=0){
				count=length+1;break;
			}
		}
		String strnew="";
		for(int i=0;i<count;i++){
			strnew=strnew+ String.valueOf(num[count-1-i]);
		}
		return strnew;
	}
}
