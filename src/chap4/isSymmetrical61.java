import java.util.*;

/**
 * Created by c84104080 on 2018/7/3.
 */
class Solution61 {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null){return false;}
        return isSymmetrical(pRoot.left,pRoot.right);
    }
    boolean isSymmetrical(TreeNode pLeft, TreeNode pRight){
        if(pLeft==null && pRight == null) {return true;}
        if(pLeft == null && pRight != null){return false;}
        if(pLeft != null && pRight == null){return false;}
        return (pLeft.val == pRight.val)&&isSymmetrical(pLeft.left,pRight.right)&&isSymmetrical(pLeft.right,pRight.left);
    }
}
public class isSymmetrical61 {
    public static void main(String[] args){
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(3);
        TreeNode n7 = new TreeNode(4);

        n1.left = n2; n1.right = n3;
        n2.left = n4; n2.right = n5;
        n3.right = n6; n3.left = n7;
        System.out.println(new Solution61().isSymmetrical(n1));
    }
}
