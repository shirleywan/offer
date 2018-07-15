package chap4;

import practice.TreeNode;
import java.util.*;

class Solution54{
	/**
	 * 如果树是二叉搜索树
	 */
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null || root == p || root == q){return root;}
		if(root.data > Math.max(p.data, q.data)){
			return lowestCommonAncestor(root.left, p, q);
			}
		if(root.data < Math.min(p.data, q.data)){
			return lowestCommonAncestor(root.right, p, q);
			}
		if(root.data >=Math.min(p.data, q.data) && root.data <= Math.max(p.data, q.data)){return root;}
		
		return null;
	}
	public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q){
		if(root == null || root ==q || root == p){return root;}
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if (left == null){return right;}
		if (right == null){return left;}
		
		return root;
	}
}

public class lowestCommonAncestor54 {
	public static void main(String[] args) {
		TreeNode n1=new TreeNode(3);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(1);
		TreeNode n4=new TreeNode(4);
		n1.left=n3;n1.right=n4;n3.right=n2;
		System.out.println(new Solution54().lowestCommonAncestor1(n1, n3, n2).data);
		
	}
}
