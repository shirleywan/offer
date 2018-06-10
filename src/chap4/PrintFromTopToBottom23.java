package chap4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue; 
import practice.TreeNode;

class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        if(root==null){return list;}
        queue.add(root);
        while(!queue.isEmpty()) {
        	TreeNode node=queue.poll();
        	list.add(node.data);
        	if(node.left!=null) {queue.add(node.left);}
        	if(node.right!=null) {queue.add(node.right);}
        }
        return list;
    }
}
public class PrintFromTopToBottom23 {
	public static void main(String[] args) {
//    	TreeNode root=new TreeNode(1);
//    	TreeNode n1=new TreeNode(2);
//    	TreeNode n2=new TreeNode(3);
//    	TreeNode n3=new TreeNode(5);
//    	TreeNode n4=new TreeNode(4);
//    	TreeNode n5=new TreeNode(6);
//    	TreeNode n6=new TreeNode(7);
//    	root.setLeft(n1);
//    	root.setRight(n2);
//    	n1.setLeft(n3);
//    	n1.setRight(n4);
//    	n2.setLeft(n5);
//    	n2.setRight(n6);
    	TreeNode root=null;
    	 ArrayList<Integer> list=new Solution().PrintFromTopToBottom(root);
    	 System.out.println(list);
	}
}
