package tester;



import java.util.Scanner;

import com.app.tree.BinarySearchTree;
import com.app.tree.BinarySearchTree.Node;
//import com.app.tree.BinarySearchTree.Node;
public class TestTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.add(50);
		bst.add(30);
		bst.add(10);
		bst.add(20);
		bst.add(40);
		bst.add(90);
		bst.add(70);
		bst.add(60);
		bst.add(80);
		bst.add(100);
		bst.preorder();
		bst.inorder();
		bst.postorder();
		
		
		System.out.print("Enter element to find: ");
		int val = sc.nextInt();
		Node temp = bst.bfsSearch(val);
		if(temp == null)
			System.out.println("BFS: Not found.");
		else
			System.out.println("BFS: Found: " + temp.getData());
		temp = bst.dfsSearch(val);
		if(temp == null)
			System.out.println("DFS: Not found.");
		else
			System.out.println("DFS: Found: " + temp.getData());
		temp = bst.binarySearch(val);
		if(temp == null)
			System.out.println("BS: Not found.");
		else
			System.out.println("BS: Found: " + temp.getData());

	}

}
