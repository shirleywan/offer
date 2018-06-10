package chap2;

import java.util.ArrayList;

public class printMatrix21 {
    public static ArrayList<Integer> printMatrix(int[][] matrix) {
    	if(matrix.length==0) {return null;}
    	ArrayList<Integer> list=new ArrayList<Integer>();
    	int n=matrix.length;int m=matrix[0].length;
    	int p=0;
    	while(n>p*2 && m>p*2) {
    		for(int i=p;i<=m-p-1;i++) {list.add(matrix[p][i]);}
    		if(p<n-1-p) {
    			for(int i=p+1;i<=n-p-1;i++) {list.add(matrix[i][m-1-p]);}
    		}
    		if(p<m-1-p&&p<n-1-p) {
    			for(int i=m-2-p;i>=p;i--) {list.add(matrix[n-1-p][i]);}
    		}
    		if(p<m-1-p&&p<n-2-p) {
    			for(int i=n-2-p;i>=p+1;i--) {list.add(matrix[i][p]);}
    		}
    		p++;
    	}
       return list;
    }
    public static void main(String[] args) {
//    	int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//    	int[][] matrix= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//    	int[][] matrix= {{1},{2},{3},{4},{5}};
    	int[][] matrix= {{1,2,3,4,5}};
    	ArrayList<Integer> list=printMatrix(matrix);
    	System.out.println(list);
	}
}