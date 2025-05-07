package oops;

import java.util.*;
class Node {
	int data;
	Node left,right;
	Node (int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

class binary {
	Node root;
	public void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder (root.left);
		System.out.print(root.data+" ");
		inorder (root.right);
	}
	public void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder (root.left);
		preorder (root.right);
	}
	public void postorder(Node root) {
		if(root==null) {
			return;
		}
		postorder (root.left);
		postorder (root.right);
		System.out.print(root.data+" ");
	}
}
public class BinaryTree {
	public static void main(String[] args) {
		binary tree = new binary();
		tree.root = new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		System.out.println("In-order Traversal");
		tree.inorder(tree.root);
		System.out.println();
		System.out.println("Pre-order Traversal");
		tree.preorder(tree.root);
		System.out.println();
		System.out.println("Post-order Traversal");
		tree.postorder(tree.root);
	}
}
