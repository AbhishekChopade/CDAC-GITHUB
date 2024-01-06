package binarytree;                                                                                                                              

public class BinaryTree {

	private Node root;
	
	private static class Node {
		static int count;
		private int data;
		private Node left;
		private Node right;

		public Node(int val) {
			++count;
			left = right = null;
			this.data=val;
		}
	}

	public BinaryTree() {
		root = null;
	}

	public void insert(int val) {
		Node newNode = new Node(val);
		if (root == null) {
			root = newNode;
		} else {
			insert(root, newNode);
		}
	}

	private void insert(Node node, Node newNode) {
		if(newNode.data < node.data) {
			if(node.left!=null) {
				insert(node.left,newNode);
			}else {
				node.left=newNode;
			}
		}else {
			if(node.right!=null) {
				insert(node.right,newNode);
			}else {
				node.right=newNode;
			}
		}
		
	}
	
	public static void printPreorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data+" ");
		printPreorder(root.left);
		printPreorder(root.right);
		
		
	}
	
	public static void printInorder(Node root) {
		if (root == null) {
			return;
		}
            
		printInorder(root.left);
		System.out.print(root.data+" ");
		printInorder(root.right);
	}
	
	public static void printPostorder(Node root) {
		if (root == null) {
			return;
		}
            
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(root.data+" ");
		
	}
	

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.insert(13);
		bt.insert(12);
		bt.insert(16);
		bt.insert(5);
		bt.insert(14);
		bt.insert(20);
		bt.insert(4);
		bt.insert(8);
		bt.insert(9);
		bt.insert(7);
		bt.insert(6);
		bt.insert(11);
		System.out.print("Inorder: ");
		printInorder(bt.root);
		System.out.println();
		System.out.print("Postorder: ");
		printPostorder(bt.root);
		System.out.println();
		System.out.print("Preorder: ");
		printPreorder(bt.root);
		System.out.println();
		System.out.println("Number of nodes: "+ Node.count);
	}

}
