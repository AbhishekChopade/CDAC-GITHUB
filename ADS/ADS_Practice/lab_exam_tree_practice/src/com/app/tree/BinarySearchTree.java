package com.app.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
	public static class Node{
		Node left;
		Node right;
		int data;
		
		public Node(int data) {
			left = null;
			right = null;
			this.data = data;
		}

		public int getData() {
			return data;
		}
		
		
	}
	
	private Node root;
	public BinarySearchTree() {
		root = null;
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(root==null) {
			root = newNode;
		}else {
			Node trav = root;
			while(true)
			{
				if(data<trav.data) {
					if(trav.left!=null)
						trav=trav.left;
					else {
						trav.left = newNode;
						break;
					}
				}else {
					if(trav.right!=null)
						trav=trav.right;
					else {
						trav.right = newNode;
						break;
					}
				}
			}
		}
	}
	
	public void preorder(Node trav) {
		if(trav==null)
			return;
		System.out.print(trav.data+" -> ");
		preorder(trav.left);
		preorder(trav.right);
	}
	
	public void preorder() {
		System.out.println("Pre-Order :");
		preorder(root);
		System.out.println();
	}
	
	public void inorder(Node trav) {
		if(trav==null)
			return;
		inorder(trav.left);
		System.out.print(trav.data+" -> ");
		inorder(trav.right);
	}
	
	public void inorder() {
		System.out.println("In-Order :");
		inorder(root);
		System.out.println();
	}
	public void postorder(Node trav) {
		if(trav==null)
			return;
		postorder(trav.left);
		postorder(trav.right);
		System.out.print(trav.data+" -> ");
	}
	
	public void postorder() {
		System.out.println("Post-Order :");
		postorder(root);
		System.out.println();
	}
	
	public Node bfsSearch(int key) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		while(!(q.isEmpty())){
			Node trav = q.poll();
			if(key==trav.data)
				return trav;
			if(trav.left!=null)
				q.offer(trav.left);
			if(trav.right!=null)
				q.offer(trav.right);
		}
		return null;
	}
	
	public Node dfsSearch(int key) {
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		while(!(s.isEmpty())){
			Node trav = s.pop();
			if(key==trav.data)
				return trav;
			if(trav.left!=null)
				s.push(trav.left);
			if(trav.right!=null)
				s.push(trav.right);
		}
		return null;
	}
	
	public Node binarySearch(int key) {
		Node trav = root;
		while(trav!=null) {
			if(key==trav.data)
				return trav;
			if(key<trav.data) {
				trav=trav.left;
			}else
				trav = trav.right;
		}
		
		
		return null;
		
	}
}
