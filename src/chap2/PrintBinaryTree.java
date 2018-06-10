//package chap2;
//
//
///**
// * 打印二叉树
// *
// * Created by nibnait on 2016/9/15.
// */
//public class PrintBinaryTree {
//
//    private static final int NODE_LENGTH = 17;      //二叉树中每个节点的长度
//
//    public static void print(TreeNode head) {
//
//        System.out.println("Binary Tree：");
//        printInOrder(head, 0, "*");
//        System.out.println();
//    }
//
//    private static void printInOrder(TreeNode head, int height, String to) {
//        if (head == null){
//            return;
//        }
//        printInOrder(head.left, height+1, "~");
//        String val = to + head.val + to;
//        int lenM = val.length();
//        int lenL = (NODE_LENGTH - lenM) / 2;
//        int lenR = NODE_LENGTH - lenL - lenM;
//        val = getSpace(height*NODE_LENGTH + lenL) + val + getSpace(lenR);
//        System.out.println(val);
//        printInOrder(head.right, height+1, "_");
//    }
//
//    private static String getSpace(int n) {
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < n; i++) {
//            sb.append(" ");
//        }
//        return sb.toString();
//    }
//
//
//    public static void main(String[] args) {
//    	TreeNode head = new TreeNode(1);
//        head.left = new TreeNode(-222222222);
//        head.right = new TreeNode(3);
//        head.left.left = new TreeNode(Integer.MIN_VALUE);
//        head.right.left = new TreeNode(55555555);
//        head.right.right = new TreeNode(66);
//        head.left.left.right = new TreeNode(777);
//        print(head);
//
//        head = new TreeNode(1);
//        head.left = new TreeNode(2);
//        head.right = new TreeNode(3);
//        head.left.left = new TreeNode(4);
//        head.right.left = new TreeNode(5);
//        head.right.right = new TreeNode(6);
//        head.left.left.right = new TreeNode(7);
//        print(head);
//
//        head = new TreeNode(1);
//        head.left = new TreeNode(1);
//        head.right = new TreeNode(1);
//        head.left.left = new TreeNode(1);
//        head.right.left = new TreeNode(1);
//        head.right.right = new TreeNode(1);
//        head.left.left.right = new TreeNode(1);
//        print(head);
//
//    }
//
//
//}
