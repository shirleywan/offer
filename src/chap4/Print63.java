/**
 * Created by c84104080 on 2018/7/4.
 */
import java.util.*;
class Solution63 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> totallist = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null) {return totallist;}
        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
        Queue<TreeNode> queue2 = new LinkedList<TreeNode>();
        queue1.add(pRoot);
        int count =0;
        while(!queue1.isEmpty() || !queue2.isEmpty()){
            ArrayList<Integer> list = new ArrayList<Integer>();
            if(count % 2 == 0){
                TreeNode node;
                while (!queue1.isEmpty()){
                    node = queue1.poll();
                    if(node.left!=null) {queue2.offer(node.left);}
                    if(node.right!=null) {queue2.offer(node.right);}
                    list.add(node.val);
                }
            }
            else{
                TreeNode node;
                while (!queue2.isEmpty()){
                    node = queue2.poll();
                    if(node.left!=null) {queue1.offer(node.left);}
                    if(node.right!=null) {queue1.offer(node.right);}
                    list.add(node.val);
                }
            }
            count ++;
            totallist.add(list);
        }
        return totallist;
    }

}
public class Print63 {
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
        System.out.println(new Solution63().Print(n1));
    }
}
