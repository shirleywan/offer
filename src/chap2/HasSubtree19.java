package chap2;

import practice.TreeNode;

public class HasSubtree19 {
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean flag=false;
        if(root1!=null && root2!=null){
        	if(root1.data==root2.data){flag=ishaveTree(root1,root2);}
        	if(!flag){flag=HasSubtree(root1.left,root2);}
        	if(!flag){flag=HasSubtree(root1.right,root2);}
        }
        return flag;
    }
    public static boolean ishaveTree(TreeNode root1,TreeNode root2){
    	if(root1==null && root2==null){return true;}
    	if(root1==null || root2==null){return false;}
    	if(root1.data!=root2.data){return false;}
    	return ishaveTree(root1.left,root2.left)&&ishaveTree(root1.right,root2.right);
    }
    public static void main(String[] args) {
    	TreeNode root=new TreeNode(50);
    	TreeNode n1=new TreeNode(25);
    	TreeNode n2=new TreeNode(60);
    	root.setLeft(n1);
    	n1.setRight(n2);
    	TreeNode root1=new TreeNode(25);
    	TreeNode n3=new TreeNode(60);
    	root1.setLeft(n3);
    	System.out.println(HasSubtree(root,root1));
	}
}
