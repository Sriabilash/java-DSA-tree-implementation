import java.util.*;
class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        left=right=null;
    }
}

class TreeNode{
    Node root;
    
    TreeNode(){
        root = null;
    }
    
    void levelOrder(){
        if(root == null){
            return;
        }
        Queue<Node> list = new LinkedList<>();
        list . add(root);
        
        while(!list.isEmpty()){
            Node current = list.poll();
            System.out.print(current.data+" ");
            
            if(current.left != null){
                list.add(current.left);
            }
            if((current.right != null)){
                list.add(current.right);
            }
        }
    }
}

public class Main{
    public static void main(String[] args){
        TreeNode tree = new TreeNode();
        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        
        System.out.println("levelOrder traversal: ");
        tree.levelOrder();
    }
}













