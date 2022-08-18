package com.gl.question2;

class Node {
	int val;
	Node left, right;

	Node(int item) {
		val = item;
		left = right = null;
	}
}

class BST {
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void flattenBTToSkewed(Node root) {
		if (root == null) {
			return;
		}
		flattenBTToSkewed(root.left);
		Node rightNode = root.right;
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		flattenBTToSkewed(rightNode);

	}

	static void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}

	public static void main(String[] args) {

		BST.node = new Node(50);
		BST.node.left = new Node(30);
		BST.node.right = new Node(60);
		BST.node.left.left = new Node(10);
		BST.node.right.left = new Node(55);

		flattenBTToSkewed(node);
		System.out.println("The resultant  output is :");
		traverseRightSkewed(headNode);
	}
}
