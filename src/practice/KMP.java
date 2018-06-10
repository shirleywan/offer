package practice;
/**
 * KMP算法实现，返回文本串匹配的索引
 * @author Administrator
 *
 */
public class KMP {
    public static int kmp(String str, String dest,int[] next){//str文本串  dest 模式串,next是dest的next数组
        for(int i = 0, j = 0; i < str.length(); i++){//i->str,j->dest
            while(j > 0 && str.charAt(i) != dest.charAt(j)){
                j = next[j - 1]; //如不匹配，返回到前一个匹配前缀的位置上，也就是next[j-1]
            }
            if(str.charAt(i) == dest.charAt(j)){
                j++;
            }
            if(j == dest.length()){
                return i-j+1;//返回到匹配子串的开头
            }
        }
        return 0;
    }
    public static int[] kmpnext(String dest){
        int[] next = new int[dest.length()];
        next[0] = 0;
        for(int i = 1,j = 0; i < dest.length(); i++){
            while(j > 0 && dest.charAt(j) != dest.charAt(i)){
                j = next[j - 1];
            }
            if(dest.charAt(i) == dest.charAt(j)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
    public static void main(String[] args){
        String a = "ababa";
        String b = "ssdfgasdbababa";
        int[] next = kmpnext(a);
        int res = kmp(b, a,next);
        System.out.println(res);//返回文本串匹配的索引
        for(int i = 0; i < next.length; i++){//输出dest的next数组
            System.out.print(next[i]);            
        }
//        System.out.println(next.length);
    }
}
