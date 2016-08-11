package com.henugao.offer.tree;

import java.util.Stack;

public class BinTree {

	public static void main(String[] args) {
		BinaryTreeNode root = init();
		System.out.println("����ݹ������");
		preOrder(root);
		System.out.println();
		System.out.println("����ݹ������");
		inOrder(root);
		System.out.println();
		System.out.println("����ݹ������");
		postOrder(root);
		System.out.println();
		System.out.println("�ǵݹ�����ݹ������");
		preOrderTraverse(root);
		System.out.println();
		System.out.println("�ǵݹ�����ݹ������");
		inOrderTraverse(root);
	}
	
	public static BinaryTreeNode init() {
		BinaryTreeNode a = new BinaryTreeNode('A');
		BinaryTreeNode b = new BinaryTreeNode('B',null,a);
		BinaryTreeNode c = new BinaryTreeNode('C');   
		BinaryTreeNode d = new BinaryTreeNode('D', b, c);   
		BinaryTreeNode e = new BinaryTreeNode('E');   
		BinaryTreeNode f = new BinaryTreeNode('F', e, null);   
		BinaryTreeNode g = new BinaryTreeNode('G', null, f);   
		BinaryTreeNode h = new BinaryTreeNode('H', d, g);   
		return h;   
	}

	/**
	 * ���ʽڵ�
	 * @param p
	 */
	public static void visit(BinaryTreeNode p) {
		System.out.print(p.getValue() + " ");
	}
	
	/**
	 * �������
	 * @param p
	 */
	public static void preOrder(BinaryTreeNode p) {
		if(p != null) {
			visit(p);
			preOrder(p.getLeft());
			preOrder(p.getRight());
		}
	}
	
	/**
	 * ����ݹ����
	 * @param p
	 */
	public static void inOrder(BinaryTreeNode p) {
		if(p != null) {
			inOrder(p.getLeft());
			visit(p);
			inOrder(p.getRight());
		}
	}
	
	/**
	 * ����ݹ����
	 * @param p
	 */
	public static void postOrder(BinaryTreeNode p) {
		if(p != null) {
			postOrder(p.getLeft());
			postOrder(p.getRight());
			visit(p);
		}
	}
	
	/**
	 * �ǵݹ��������
	 * @param p
	 */
	public static void preOrderTraverse(BinaryTreeNode p) {
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		if(p != null) {
			stack.push(p);
		}
		while(!stack.isEmpty()) {
			p = stack.pop();
			visit(p);
			if(p.getRight() != null) {
				stack.push(p.getRight());
			}
			if (p.getLeft() != null) {
				stack.push(p.getLeft());
			}
		}
	}
	
	/**
	 * �ǵݹ��������
	 * @param p
	 */
	public static void inOrderTraverse(BinaryTreeNode p) {
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		while(p != null || !stack.isEmpty()) {
			if(p != null) {
				stack.push(p);
				p = p.getLeft();
			}else {
				p = stack.pop();
				visit(p);
				p = p.getRight();
			}
		}
	}
	
	public static void postOrderTraverse(BinaryTreeNode p) {
		
	}
 }
