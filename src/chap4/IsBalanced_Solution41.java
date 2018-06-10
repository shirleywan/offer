package chap4;

import java.util.*;

import practice.TreeNode;

class IsBalancedTree {
    boolean isBalance=true;
    public boolean IsBalanced_Solution(TreeNode root) {         
         TreeDepth1(root);
         return isBalance;
        //isBalance 会在 TreeDepth1(root)中赋值。
        }
    public int TreeDepth1(TreeNode root)
     {
         if(root==null)
             return 0;
         int left=TreeDepth1(root.left);
         //左子树高度
         int right=TreeDepth1(root.right);
         //右子树高度
         if(Math.abs(left-right)>1)
         {
             isBalance=false;
             //只要有一个子树的左右子树的高度绝对值大于 1 isBalance=false
         }
         return Math.max(left, right)+1;
     }
}

class Solution41 {
    public boolean IsBalanced_Solution(TreeNode root) {
    	int depth=0;
    	return Isbalance(root, depth);
    	
    }
    public static boolean Isbalance(TreeNode root,int depth) {
    	if(root==null) {depth=0;return true;}
//    	int left=TreeDepth(root.left),right=TreeDepth(root.right);
    	int left=0,right=0;
    	if(Isbalance(root.left, left) && Isbalance(root.right, right)) {
    		int diff=Math.abs(left-right);
    		if(diff<=1) {
    			depth=1+(left > right ? left : right);
    			return true;
    		}
    	}
    	return false;
    }
	public static List<Integer> behindOrder(TreeNode root,List<Integer> list) { //递归后续遍历
		if(root.left!=null) {behindOrder(root.left,list);}
		if(root.right!=null) {behindOrder(root.right,list);}
		list.add(root.data);
		return list;
	}
    public static int TreeDepth(TreeNode root) {
    	int count1=0,count2=0;
    	if(root==null) {return 0;}
    	if(root.left==null && root.right==null) {return 1;}
    	if(root.left!=null) {count1=TreeDepth(root.left)+1;}
    	if(root.right!=null) {count2=TreeDepth(root.right)+1;}
        return Math.max(count1, count2);
    }
}

public class IsBalanced_Solution41 {
	public static void main(String[] args) {
    	TreeNode root=new TreeNode(1);
    	TreeNode n1=new TreeNode(2);
    	TreeNode n2=new TreeNode(3);
    	TreeNode n3=new TreeNode(4);
    	TreeNode n4=new TreeNode(7);
    	TreeNode n5=new TreeNode(6);
    	TreeNode n6=new TreeNode(5);
    	TreeNode n7=new TreeNode(10);
    	root.setLeft(n1);
    	root.setRight(n2);
    	n1.setRight(n4);
    	n1.setLeft(n3);
    	n2.setLeft(n5);
    	n5.setRight(n6);
//    	n6.setLeft(n7);
    	//测试后续遍历
//    	List<Integer> list=new ArrayList<Integer>();
//    	System.out.println(new Solution41().behindOrder(root, list));
//    	boolean flag=new Solution41().IsBalanced_Solution(root);
//    	System.out.println(flag);
    	boolean flag=new IsBalancedTree().IsBalanced_Solution(root);
    	System.out.println(flag);
	}
}
