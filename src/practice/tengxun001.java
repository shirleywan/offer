package practice;

import java.util.*;

public class tengxun001 {
	static int[][] dp;
	static int[][] flag;
	static int n;
	static int m;
	public static int height(int[][] A,int x,int y){
		if(A.length == 0){return 0;}
		n=A.length;
		m=A[0].length;
		int ans=0;
		dp=new int[n][m];
		flag=new int[n][m];
		
		for(int i=x;i<n;i++){
			for(int j=y;j<m;j++){
				dp[i][j]=search(i,j,A); //不比较长度
				ans=Math.max(ans,A[i][j]);
			}
		}
		return ans;
	}
	static int[] dx={1,-1,0,0};
	static int[] dy={0,0,1,-1};
	public static int search(int x,int y,int[][] A){
		if(flag[x][y]!=0){return dp[x][y];}
		
		int ans=1;
		int nx,ny;
		for(int i=0;i<4;i++){
			nx=x+dx[i];
			ny=y+dy[i];
			if(0<=nx && nx<n && 0<=ny &&ny<m){
				if(A[x][y]<A[nx][ny]){
					ans=Math.max(dp[nx][ny], dp[x][y]+search(nx, ny, A));
				}
			}
			
		}
		flag[x][y]=1;
//		dp[x][y]=ans;
		return ans;
	}
	public static void main(String[] args) {
		int[][] num={{9,9,4},{6,6,8},{2,1,1}};
		System.out.println(height(num,2,1));
	}
}
