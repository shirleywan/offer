package practice;
/**
 * 最长回文字串
 * @author admin
 *
 */
public class LongestPara {
	public static String LCS(String str1,String str2){
		int[][] chess=new int[str1.length()+1][str2.length()+1];
		int i=0,j=0;
		for(i=0;i<=str1.length();i++){chess[i][0]=0;}
		for(j=0;j<=str2.length();j++){chess[0][j]=0;}
		for(i=1;i<=str1.length();i++){
			for(j=1;j<=str2.length();j++){
				if(str1.charAt(i-1)==str2.charAt(j-1)){chess[i][j] = chess[i-1][j-1]+1;}
				else{chess[i][j]=Math.max(chess[i-1][j], chess[i][j-1]);}
			}
		}
		i=str1.length();
		j=str2.length();
		StringBuffer str = new StringBuffer("");  
		while(i!=0 && j!=0){
			if(str1.charAt(i-1)==str2.charAt(j-1)){
				str=str.append(str1.charAt(i-1));
				i--;j--;
			}
			else{
				if(chess[i][j-1]>chess[i-1][j]){j--;}
				else{i--;}
			}
		}
		str.reverse();
		return str.toString();
	}

	public static String reverse(String str) {
		StringBuilder s=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			s.append(str.charAt(i));
		}
		return s.toString();
	}
	public static void main(String[] args) {
		String s="abmmnba";
		String str=LCS(s, reverse(s));
		System.out.println(str);
	}
}
