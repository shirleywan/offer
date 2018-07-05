import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collector;

/**
 * Created by c84104080 on 2018/7/4.
 */
class Solution64 {
    //方法稍笨，需要使用到先序遍历得到list，在转为string -- 不过想法是一样的
//    public String Serialize1(TreeNode root) {
//        if(root == null){return "#,";}
//        ArrayList<Character> list = new ArrayList<Character>();
//        preOrder(root,list);
//        StringBuffer str = new StringBuffer();
//        for(int i=0; i<list.size(); i++){
//            str.append(list.get(i)+",");
//        }
//        return str.toString();
//    }
    public String Serialize(TreeNode root) {
        if(root == null){return "#,";}
        StringBuffer str = new StringBuffer(root.val+ ",");
        str.append(Serialize(root.left));
        str.append(Serialize(root.right));
        return str.toString();
    }
    public TreeNode Deserialize(String str) {
        String[] string = str.split(",");
        Queue<String> queue = new LinkedList<String>();
        for (int i=0 ; i<string.length ; i++){
            queue.offer(string[i]);
        }
        return preOrder(queue);
    }
    public ArrayList<Character> preOrder(TreeNode root , ArrayList<Character> list){
        if(root == null){return list;}
        list.add(String.valueOf(root.val).toCharArray()[0]);
        if(root.left != null){preOrder(root.left , list);}
        else{list.add('#');}
        if(root.right != null){preOrder(root.right , list);}
        else{list.add('#');}
        return list;
    }
    public TreeNode preOrder(Queue<String> queue){
        String c = queue.poll();
        if ( c.equals("#" )) return null;
        TreeNode node = new TreeNode(Integer.valueOf(c));
        node.left = preOrder(queue);
        node.right = preOrder(queue);
        return node;
    }

}
public class SerializeTree64 {
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
        ArrayList<Character> list = new ArrayList<Character>();
//        System.out.println(new Solution64().preOrder(n1,list));
//        System.out.println(new Solution64().Serialize(n1));
        String s = "8,6,10,5,7,9,11";
        System.out.println((new Solution64().Deserialize(s)).val);
    }
}
