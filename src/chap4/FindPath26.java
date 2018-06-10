package chap4;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.w3c.dom.ls.LSInput;

import chap2.stackQueue07;
import practice.TreeNode;

class Solution26 {
//    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
//        ArrayList<Integer> list=new ArrayList<Integer>();
//        ArrayList<ArrayList<Integer>> total=new ArrayList<ArrayList<Integer>>();
//        Stack<TreeNode> stack=new Stack<TreeNode>();
//        Stack<TreeNode> stacknew=new Stack<TreeNode>();
//        int count=0;
//        if(root.data>target) { return total; }
//        if(root.data==target) {list.add(root.data);total.add(list);return total;}
//        TreeNode p=root;
//        stack.push(p);count=count+p.data;
//        if(p.left!=null) {p=p.left;}
//        else {p=p.right;}
//        while(!stack.isEmpty()) {
//        	if(p!=null) { 
//        		System.out.println(count);
//        		if(count+p.data<target) {
//        			stack.push(p);count+=p.data;
//        			if(isNull(p)) {count=count-p.data;stack.pop();p=Father(root, p).right;continue;}
//        			else{p=p.left;continue;}
//        		}
//        		if(count+p.data==target) {
//        			while(!stack.isEmpty()) {stacknew.push(stack.pop());}
//        			while(!stacknew.isEmpty()) {list.add(stacknew.peek().data);stack.push(stacknew.pop());}
//        			total.add(list);
//        			p=Father(root, p);p=Father(root, p).right;
//        			continue;
//        		}
//        		if(count+p.data>target) {
//        			p=Father(root, p).right;
//        			continue;
//        		}
//        	}
//        }
//        
//        return total;
//    }
	/**
	 * good-idea!
	 * @param root
	 * @param target
	 * @return
	 */
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target)  
    {  
        ArrayList<ArrayList<Integer>> pathlist = new ArrayList<ArrayList<Integer>>();   
        if(root == null || root.data > target)  
            return pathlist;  
       ArrayList<Integer> path = new ArrayList<Integer>();  
               findPath(root,target,pathlist,path);  
               return pathlist;  
    }  
    private void findPath(TreeNode root,int target,ArrayList<ArrayList<Integer>> pathlist,ArrayList<Integer> path)  
    {  
        //如果节点为空，或者值小于target此条路径清空  
        if(root == null || root.data > target)  
        {  
            path.clear();  
        }  
        else if(root.data == target)//如果当前节点等于target且为叶子节点则直接将它添加到path中，否则这条路径清空  
        {  
            if(root.left == null && root.right==null)  
            {  
                path.add(root.data);  
                pathlist.add(path);  
            }  
            else  
            {  
                path.clear();  
            }  
        }  
        else  //当根节点的值小于target，则递归去寻找它的左右子树  
        {  
            path.add(root.data);  
            ArrayList<Integer> path2 = new ArrayList<Integer>();  
            path2.addAll(path);  
            target -= root.data;  
            findPath(root.left,target,pathlist,path);  //这里，将path作为参数传入函数中，所以每次加节点都会放入这个list中，然后再将list装入pathlist中
            findPath(root.right,target,pathlist,path2);  
        }  
    }  
    
    
    public boolean isNull(TreeNode root) {
    	if(root.left==null && root.right==null) {return true;}
    	return false;
    }
    public TreeNode Father(TreeNode root,TreeNode n1) {
    	if(root==null||root==n1) {return null;}
    	TreeNode p=root;
    	if(p.left==n1 || p.right==n1) {return p;}
    	if(Father(p.left, n1)!=null) {return p.left;}
    	p=Father(p.right, n1);
    	return p;
    }
}

public class FindPath26 {
	public static void main(String[] args) {
    	TreeNode root=new TreeNode(1);
    	TreeNode n1=new TreeNode(2);
    	TreeNode n2=new TreeNode(3);
    	TreeNode n3=new TreeNode(4);
    	TreeNode n4=new TreeNode(7);
    	TreeNode n5=new TreeNode(6);
    	TreeNode n6=new TreeNode(5);
    	root.setLeft(n1);
    	root.setRight(n2);
    	n1.setLeft(n3);
    	n1.setRight(n4);
    	n2.setLeft(n5);
    	n2.setRight(n6);
    	ArrayList<ArrayList<Integer>> total=new ArrayList<ArrayList<Integer>>();
    	total=new Solution26().FindPath(root,10);
    	System.out.println(total);
    	//测试在树中找父节点
//    	TreeNode node=new Solution26().Father(root, n6);
//    	System.out.println(node.data);
	}
}
