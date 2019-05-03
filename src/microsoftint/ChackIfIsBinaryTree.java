package microsoftint;

public class ChackIfIsBinaryTree {
	
Node root;
	static class Node{
		Node left, right;
		int data;
		
		Node(int d) {
			data = d;
			left = right = null;
		}
	}
	
	
	boolean isBst() {
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	boolean isBSTUtil(Node node, int min, int max) {
		
		if(node == null) {
			return true;
		}
		
		if(node.data < min || node.data > max) {
			return false;
		}
		
		return (isBSTUtil(node.left, min, node.data-1) && 
				isBSTUtil(node.right, node.data+1, max));
	}
	
	public static void main(String[] args) {
		ChackIfIsBinaryTree binaryTree = new ChackIfIsBinaryTree();
			binaryTree.root = new Node(4);
			binaryTree.root.left = new Node(2);
			binaryTree.root.right = new Node(5);
			binaryTree.root.left.right = new Node(3);
			binaryTree.root.left.left = new Node(1);
			
			if(binaryTree.isBst())
				System.out.println("Is binary");
			else
				System.out.println("Is not");

	}
	
}
