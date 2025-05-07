class Node{
    int data;
    Node left, right;
    Node (int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class TreeNode{
    Node root;
    
    TreeNode(){
        root = null;
    }
    
    int height(Node node){
        if(node == null){
            return -1;
        }
        
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        
        return Math.max(leftHeight, rightHeight)+1;
    }
}
public class Main
{
	public static void main(String[] args) {
	    TreeNode tree = new TreeNode();
	    
	    tree.root = new Node(1);
	    tree.root.left = new Node(2);
	    tree.root.right = new Node(3);
	    tree.root.left.left = new Node(4);
	    tree.root.left.right = new Node(5);
	    tree.root.right.left = new Node(6);
	    tree.root.right.right = new Node(7);
	    tree.root.left.left.left = new Node(8);
	    
	    int heightoftree = tree.height(tree.root);
	    System.out.println(heightoftree);
	}
}
