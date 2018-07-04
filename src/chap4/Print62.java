/**
 * Created by c84104080 on 2018/7/4.
 */
import java.util.*;
class Solution62 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> totallist = new ArrayList<ArrayList<Integer>>();
        if(pRoot==null) {return totallist;}
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        stack1.push(pRoot);
        int count=0;
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            ArrayList<Integer> list = new ArrayList<Integer>();
            if(count % 2==0){
                while(!stack1.isEmpty()){
                    TreeNode node = stack1.pop();
                    if(node.left != null){stack2.push(node.left);}
                    if(node.right != null){stack2.push(node.right);}
                    list.add(node.val);
                }
            }
            else{
                while (!stack2.isEmpty()){
                    TreeNode node = stack2.pop();
                    if(node.right != null){stack1.push(node.right);}
                    if(node.left != null){stack1.push(node.left);}
                    list.add(node.val);
                }
            }
            count++;
            totallist.add(list);
        }
        return totallist;
    }

}
public class Print62 {
    public static void main(String[] args){
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        n1.left = n2; n1.right = n3;
        n2.left = n4; n3.left = n5; n3.right = n6;
        n4.right = n7;
        System.out.println(new Solution62().Print(n1));
    }
}
