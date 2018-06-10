package chap4;


class Solution24 {
    public boolean VerifySquenceOfBST(int [] sequence) {
    	if(sequence.length==0) {return false;}
//    	if(sequence.length==1 || sequence.length==2) {return true;}
        int n=sequence.length-1;
        int i=0;
        boolean p=true,q=true;
        for(i=0;i<=n;i++){
            if(sequence[i]>=sequence[n]){break;}
        }
        for(int j=i;j<n;j++) {if(sequence[j]<sequence[n]) return false;}
        int[] left=new int[i];
        for(int j=0;j<i;j++) {left[j]=sequence[j];}
        int[] right=new int[n-i];
        for(int j=0;j<n-i;j++) {right[j]=sequence[j+i];}
        if(i>0) {p=VerifySquenceOfBST(left);}
        if(i<n) {q=VerifySquenceOfBST(right);}
        return p&&q;
    }
}

public class VerifySquenceOfBST24 {
	public static void main(String[] args) {
		int[] nums= {1};
		boolean flag=new Solution24().VerifySquenceOfBST(nums);
		if(flag) {System.out.println("Yes");}
		else {System.out.println("No");}
	}

}
