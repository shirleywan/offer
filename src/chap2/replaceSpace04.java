package chap2;

public class replaceSpace04 {
	/**
	 * 申请一个新StringBuffer
	 * @param args
	 */
    public static void main(String[] args) {
    	StringBuffer str = new StringBuffer("hello world");
    	int n=str.length(),count=0;
        for(int i=0;i<str.length();i++){if(str.charAt(i)==' '){count++;}}
        StringBuffer strnew = new StringBuffer();
        strnew.setLength(n+count*2);
        int i=str.length()-1,j=strnew.length()-1;
        while(i>=0){
        	if(str.charAt(i)==' '){strnew.setCharAt(j, '0');strnew.setCharAt(j-1, '2');strnew.setCharAt(j-2, '%');j=j-3;i--;}
        	else{strnew.setCharAt(j, str.charAt(i));j--;i--;}
        }
        System.out.println(strnew.toString());
	}
    /**
     * 在原StringBuffer上改动
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
    	int n=str.length(),count=0;
        for(int i=0;i<str.length();i++){if(str.charAt(i)==' '){count++;}}
        str.setLength(n+count*2);
        int i=str.length()-count*2-1,j=str.length()-1;
        while(i>=0){
        	if(str.charAt(i)==' '){str.setCharAt(j, '0');str.setCharAt(j-1, '2');str.setCharAt(j-2, '%');j=j-3;i--;}
        	else{str.setCharAt(j, str.charAt(i));j--;i--;}
        }
        return str.toString();
    }
}
