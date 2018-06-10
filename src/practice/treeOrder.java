package practice;

import java.util.*;  
 
public class treeOrder{  
    public static void main(String []args){  
//        int n;  
//        TreeNode root = null;  
//        int[] te={10,6,4,8,14,12,16}; 
//        for(int  i = 0;i < te.length;i++){  
//            root = TreeNode.insert(root,te[i]);  
//        }  
//        if(root != null){  
//            root.preOrder();  
//        }  
    	
    	TreeNode root=new TreeNode(50);
    	TreeNode n1=new TreeNode(25);
    	TreeNode n2=new TreeNode(60);
    	TreeNode n3=new TreeNode(10);
    	TreeNode n4=new TreeNode(35);
    	TreeNode n5=new TreeNode(75);
    	root.setLeft(n1);
    	root.setRight(n2);
    	n1.setLeft(n3);
    	n1.setRight(n4);
    	n2.setRight(n5);
    	
    	root.preOrder();
    	System.out.println();
    	root.midOrder();
    	System.out.println();
    	root.forOrder();
    }  
}  

