package com.henugao.offer.tree;

/**
 * 二叉树的数据结构
 * @author henugao
 *
 */
public class BinaryTreeNode {

	public char value;
	public BinaryTreeNode left;
	public BinaryTreeNode right;
	

	public BinaryTreeNode(char value,BinaryTreeNode left,BinaryTreeNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	public BinaryTreeNode(char value) {
		this.value = value;
	}

	public BinaryTreeNode() {
		
	}
	
	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	
	
}
