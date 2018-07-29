<<<<<<< HEAD
package chap4;

import java.util.ArrayList;
import java.util.List;
import others.TreeLinkNode;
/**
 * Created by c84104080 on 2018/7/2.
 */
class Solution60 {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        List<TreeLinkNode> list = new ArrayList<TreeLinkNode>();

        return null;
    }
    public List<TreeLinkNode> midOrder(TreeLinkNode node , List<TreeLinkNode> list){
        if(node == null) return list;
        if(node.left != null ) midOrder(node.left,list);
        else{
            list.add(node);
        }
        if(node.right !=null)  midOrder(node.right,list);
        return list;
    }
=======
import sun.awt.SunGraphicsCallback;

import java.util.*;
import java.util.List;

class Solution60 {
    /**
     * 最笨方法，中序遍历后找到下一个节点，但是需要两个参数；一个是遍历树节点，另一个是待查找节点;
     * @param pNode
     * @return
     */
    public TreeLinkNode GetNext1(TreeLinkNode pNode)
    {
        if(pNode == null ){return null;}
        TreeLinkNode root = pNode.next;
        while(root.next!= null){
            root=root.next;
        }
        if(root.next!=null){root = root.next;}
//        System.out.println(root.val);
        List<TreeLinkNode> list = new ArrayList<TreeLinkNode>();
        midOrder(root , list);
        for(int i=0;i < list.size()-1 ; i++) {
            if (list.get(i) == pNode) {
                return list.get(i + 1);
            }
        }
        return null;
    }
    public List<TreeLinkNode> midOrder(TreeLinkNode node , List<TreeLinkNode> list){
        if(node.left == null && node.right == null) {list.add(node);return list;}
        if(node.left != null ) midOrder(node.left,list);
        list.add(node);
        if(node.right !=null)  midOrder(node.right,list);
        return list;
    }
    /**
     * 根据中序遍历的特点，要找到一个节点的下一个节点无非就是三种情况：
     * 1、有右子树，这时只需要把其右孩子作为下一个遍历的（并不是要找的）节点，然后沿着该节点的左子树（如果有的话）出发，直到遇到叶子节点，
     * 那么该叶子节点就是其下一个要找的节点；
     * 2、没有右子树，则判断该节点是否是其父节点的左孩子，如果是则其下一个要找的节点是其父节点；
     * 3、如果不是其父节点的左孩子，则把其父节点作为下一个遍历的节点，向上回溯，直到找到父节点没有父节点并且父节点是父节点的父节点的左孩子为止。
     * 综合这三种情况就可以找到二叉树中任意一个节点的下一个节点。
     */
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if (pNode.right!=null){return pNode.right;}
        if(pNode.next!=null) {
            TreeLinkNode p = pNode.next;
            if (p.left == pNode) {
                return p;
            } else {
                if (pNode.right != null) {
                    return pNode.right;
                }
                if (pNode.next.next != null) {
                    TreeLinkNode n = pNode.next.next;
                    if (n.left == p) {
                        return n;
                    }
                }
            }
        }
        return null;
    }
>>>>>>> 2233803cba882e0dcaac803bd90d6de6d1a631c9
}
public class GetNext60 {
    public static void main(String[] args){
        TreeLinkNode n1 = new TreeLinkNode(1);
        TreeLinkNode n2 = new TreeLinkNode(2);
        TreeLinkNode n3 = new TreeLinkNode(3);
        TreeLinkNode n4 = new TreeLinkNode(4);
        TreeLinkNode n5 = new TreeLinkNode(5);
        TreeLinkNode n6 = new TreeLinkNode(6);
        TreeLinkNode n7 = new TreeLinkNode(7);
<<<<<<< HEAD
        n1.left = n2; n1.right = n3;
        n2.left = n4;  n3.left = n5; n3.right = n6;
        n6.left = n7;
//        new Solution60().GetNext(n1);
        List<TreeLinkNode> list = new ArrayList<TreeLinkNode>();
        new Solution60().midOrder(n1,list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).val);
        }
        System.out.println(list.toString());
    }
}
=======
        n1.left = n2; n1.right = n3;  n2.next=n1;  n3.next=n1;
        n2.right = n4;  n3.left = n5; n3.right = n6;
        n4.next = n2;  n5.next = n3; n6.next = n3;
        n6.left = n7;
        n7.next = n6;
//        new Solution60().GetNext(n1);
        //使用第一种方法
        List<TreeLinkNode> list = new ArrayList<TreeLinkNode>();
//        new Solution60().midOrder(n1,list);
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i).val);
//        }
        System.out.println((new Solution60().GetNext(n4)).val);

//        System.out.println((new Solution60().GetNext(n6)).val);
    }
}
>>>>>>> 2233803cba882e0dcaac803bd90d6de6d1a631c9
