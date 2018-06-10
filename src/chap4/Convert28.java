package chap4;

import java.util.ArrayList;
import java.util.List;

import practice.TreeNode;

//class Solution28 {
//    public TreeNode Convert(TreeNode pRootOfTree) {
//    	List<Integer> list=new ArrayList<Integer>();
//    	order(pRootOfTree, list);
////    	System.out.println(list);
//    	TreeNode p=null;
//    	TreeNode q=null;
//    	TreeNode z=null;
//    	for(int i=0;i<list.size();i++) {
//    		if(i==0 && i+1<=list.size()) {p=find(pRootOfTree, list.get(i));q=find(pRootOfTree, list.get(i+1));p.right=q;q.left=p;}
//    		if(i-1>=0 && i+1<list.size()) {
//    			p=find(pRootOfTree, list.get(i-1));q=find(pRootOfTree, list.get(i));z=find(pRootOfTree, list.get(i+1));
//    			p.right=q;q.left=p;q.right=z;z.left=q;
//    		}
//    		if(i-1>=0 && i+1==list.size()) {
//    			p=find(pRootOfTree, list.get(i-1));q=find(pRootOfTree, list.get(i));q.left=p;
//    		}
//    	}
//    	while(q.left!=null) {
//    		q=q.left;
//    	}
//    	return q;
////    	for(int i=0;i<list.size();i++) {
////    		if(list.get(i)==pRootOfTree.data) {
////    			m= ((i-1)>= 0) ? list.get(i-1):0;
////    			n= ((i+1)<list.size()) ?n=list.get(i+1) :0;
////    		}
////    	}
////    	System.out.println(pRootOfTree.data+","+m+","+n);
////    	if(m!=0) {p=find(pRootOfTree, m);}
////    	if(n!=0) {q=find(pRootOfTree, n);}
////    	p.right=pRootOfTree;pRootOfTree.left=p;q.left=pRootOfTree;pRootOfTree.right=q;
////    	System.out.println(p.data+","+q.data);
////    	if(pRootOfTree.left!=null) {Convert(pRootOfTree.left);}
////    	if(pRootOfTree.right!=null) {Convert(pRootOfTree.right);}
////    	while(p.left==null) {p=p.left;}
////        return p;
//    }
//    public void order(TreeNode root,List list){
//        if(root.left!=null){order(root.left,list);}
//        list.add(root.data);
//        if(root.right!=null) {order(root.right,list);}
//    }
//    public TreeNode find(TreeNode root,int n) {
//    	TreeNode p=root;
//    	TreeNode q=null;
//    	if(p.data==n) {return p;}
//    	if(p.left!=null) {q=find(p.left, n);}
//    	if(q==null && p.right!=null) {q=find(p.right, n);}
//    	return q;
//    }
//}
class Solution28 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null){return null;}
        TreeNode begin=null;
        begin=convert(pRootOfTree, begin);
        TreeNode p=begin;
        while(p.left!=null && p!=null){p=p.left;}
        return p;
    }
    public TreeNode convert(TreeNode root,TreeNode begin){
	        TreeNode p=root;
	        if(p.left!=null){
	            begin=convert(p.left,begin);
	        }
	        p.left=begin;
	        if(begin!=null){begin.right=p;}
	        begin=p;
	        if(p.right!=null){begin=convert(p.right,begin);}
	        return begin;
    }
}

public class Convert28 {
	public static void main(String[] args) {
		TreeNode n1=new TreeNode(10);
		TreeNode n2=new TreeNode(6);
		TreeNode n3=new TreeNode(14);
		TreeNode n4=new TreeNode(4);
		TreeNode n5=new TreeNode(8);
		TreeNode n6=new TreeNode(12);
		TreeNode n7=new TreeNode(16);
		n1.setLeft(n2);
		n1.setRight(n3);
		n2.setLeft(n4);
		n2.setRight(n5);
		n3.setLeft(n6);
		n3.setRight(n7);
//		List list=new ArrayList();
//		new Solution28().order(n1, list);
//		System.out.println(list);
//		TreeNode p=new Solution28().find(n2, 8);
//		System.out.println(p.data);
		
//		new Solution28().convert(n1, null);
		
		
		TreeNode p=new Solution28().Convert(n1);
		while(p!=null) {
			System.out.print(p.data+",");
			p=p.right;
		}

		
	}
}
