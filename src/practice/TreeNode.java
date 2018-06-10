package practice;

public class TreeNode{  
    public int data;  
    public TreeNode left,right;  
    public TreeNode(int te){  
        this.data = te;  
        this.left = this.right =null;  
    }  
    public TreeNode getLeft(){
    	return this.left;
    }
    public void setLeft(TreeNode node){
    	this.left=node;
    }
    public TreeNode getRight(){
    	return this.right;
    }
    public void setRight(TreeNode node){
    	this.right=node;
    }
    
//    public static TreeNode insert(TreeNode root,int te){  
//        if(root == null){  
//            root = new TreeNode(te);  
//        }  
//        else if(te < root.data){  
//            root.left = TreeNode.insert(root.left, te);  
//        }  
//        else{  
//            root.right = TreeNode.insert(root.right,te);  
//        }  
//        return root;  
//    }  
    
    public void preOrder(){  
        System.out.print(this.data+" ");  
        if(this.left != null){  
            this.left.preOrder();  
        }  
        if(this.right != null){  
            this.right.preOrder();  
        }  
    }  
    public void midOrder(){    
        if(this.left != null){  
            this.left.midOrder();  
        }  
        System.out.print(this.data+" ");
        if(this.right != null){  
            this.right.midOrder();  
        }  
    } 
    public void forOrder(){    
        if(this.left != null){  
            this.left.forOrder();  
        }  
        if(this.right != null){  
            this.right.forOrder();  
        }
        System.out.print(this.data+" ");
    } 
} 
