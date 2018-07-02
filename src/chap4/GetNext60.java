import java.util.ArrayList;
import java.util.List;

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
