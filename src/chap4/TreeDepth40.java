package chap4;

import java.util.LinkedList;
import java.util.Queue;

import practice.TreeNode;

class Solution40 {
    public int TreeDepth(TreeNode root) {
    	int count1=0,count2=0;
    	if(root==null) {return 0;}
    	if(root.left==null && root.right==null) {return 1;}
    	if(root.left!=null) {count1=TreeDepth(root.left)+1;}
    	if(root.right!=null) {count2=TreeDepth(root.right)+1;}
        return Math.max(count1, count2);
    }
}
public class TreeDepth40 {
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
    	n6.setLeft(n7);
    	int num=new Solution40().TreeDepth(root);
    	System.out.println(num);
	}
}
