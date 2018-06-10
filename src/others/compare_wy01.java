package others;

public class compare_wy01 {
	public static int compare(String s,String r) {
		if(s.length() < r.length()) {return 0;}
		int n=r.length();
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<s.length()-n+i+1;j++) {
				if(r.charAt(i)!=s.charAt(j)) {count++;}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String s="aaabb";
		String r="bab";
		System.out.println(compare(s, r));
	}
}
