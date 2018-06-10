package practice;

public class test_ali {
	public static int findCount(int[] str1,int[] str2) {
		int count=0;int i=0,j=0,min=Integer.MAX_VALUE,k=0;
		int n=str1.length;
		int[][] array=new int[n][n+1];
		for(j=0;j<n;j++) {
			min=Integer.MAX_VALUE;
			for(i=0;i<n;i++) {
	//			if(str1.indexOf(i)==str2.indexOf(i)) {count++;}
				array[j][i]=Math.abs(str2[j]-str1[i])+1;
				if(i==j) {array[j][i]--;}
				if(array[j][i]<min) {min=array[j][i];}
			}
			array[j][n]=min;
		}
		for(int g=0;g<str1.length;g++) {
			for(int h=0;h<str1.length+1;h++) {
				System.out.print(array[g][h]+" ");
			}
			System.out.print('\n');
		}
		int p=n-1;
		while(p!=0) {
			for(j=0;j<n;j++) {
				if(array[j][n]>min) {min=array[j][n];k=j;}
			}
			count=count+min;
			for(i=0;i<n;i++) {
				if(array[k][i]==min) {for(j=0;j<n;j++) {array[j][i]=Integer.MAX_VALUE;}str2[k]=str2[i];}
			}
			for(j=0;j<n;j++) {
				min=Integer.MAX_VALUE;
				for(i=0;i<n;i++) {
					if(array[j][i]==Integer.MAX_VALUE) {continue;}
					array[j][i]=Math.abs(str2[j]-str1[i])+1;
					if(i==j) {array[j][i]--;}
					if(array[j][i]<min) {min=array[j][i];}
				}
				array[j][n]=min;
			}
			System.out.println(p+":");
			for(int g=0;g<str1.length;g++) {
				for(int h=0;h<str1.length+1;h++) {
					System.out.print(array[g][h]+" ");
				}
				System.out.print('\n');
			}
			
			p--;
			
		}
		
		return count;
	}
	public static void main(String[] args) {
		int[] str1= {8,3,4,2,5,6};
		int[] str2= {8,9,5,4,3,2};
//		int[][] num=findCount(str1,str2);
//		for(int i=0;i<str1.length;i++) {
//			for(int j=0;j<str1.length+1;j++) {
//				System.out.print(num[i][j]+" ");
//			}
//			System.out.print('\n');
//		}
		int num=findCount(str1,str2);
		System.out.println(num);
	}
}
