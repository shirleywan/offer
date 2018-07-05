/**
 * Created by c84104080 on 2018/7/5.
 */
import java.util.*;
class Solution65 {
    /**
     * 笨方法，二叉搜索树中序遍历的顺序即是从小到大的排序
     * @param pRoot：根节点
     * @param k ：第k大的值
     * @return
     */
    public TreeNode KthNode1(TreeNode pRoot, int k)
    {
        if(k<=0) {return null;}
        if(pRoot == null) {return null;}
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        midOrder(pRoot , list);
        if(k>list.size()){return null;}
        return list.get(k-1);
    }
    public ArrayList<TreeNode> midOrder(TreeNode root, ArrayList<TreeNode> list){
        if(root == null){return list;}
        if(root.left != null ){midOrder(root.left, list);}
        list.add(root);
        if(root.right != null){midOrder(root.right , list);}
        return list;
    }


}
public class KthNode65 {
    public static void main(String[] args){
        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(6);
        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(7);
        TreeNode n7 = new TreeNode(2);
        n1.left = n2; n1.right = n3;
        n2.left = n4; n3.left = n5; n3.right = n6;
        n4.right = n7;
        //验证中序遍历
//        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
//        new Solution65().midOrder(n1,list);
//        System.out.println(list);
        //验证笨方法解决
       System.out.println(new Solution65().KthNode1(n1,2).val);
    }
}
