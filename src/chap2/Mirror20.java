package chap2;

import practice.TreeNode;

public class Mirror20 {
    public void Mirror(TreeNode root) {
    	int temp=0;
        while(root!=null){
        	if(root.left!=null&&root.right!=null){temp=root.left.data;root.left.data=root.right.data;root.right.data=temp;}
        	if(root.left==null){}
        }
    }
    public static void main(String[] args) {
		
	}
}
