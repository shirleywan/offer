package chap2;

public class JumpFloorII11 {
//    public static int JumpFloorII(int target) {
//    	if(target==0){return 0;}
//        if(target==1){return 1;}
//    	return (int) Math.pow(2,(target-1));
//    }
	public static int JumpFloorII(int target) {
		if(target==0){return 0;}
		if(target==1){return 1;}
		
		return JumpFloorII(1)+JumpFloorII(2)+JumpFloorII(3)+1;
	}
    public static void main(String[] args) {
		int num=3;
		System.out.println(JumpFloorII(num));
	}
}
