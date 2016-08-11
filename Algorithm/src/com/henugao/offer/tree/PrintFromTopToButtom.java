package com.henugao.offer.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 面试题23 从上到下打印二叉树
 * @author henugao
 *
 */
public class PrintFromTopToButtom {

	public static void main(String[] args) {
		
	}
	
	public static void printFromTopToBottom(BinaryTreeNode root) {
		if(root == null)
			return;
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			BinaryTreeNode poll = queue.poll();
			System.out.println(poll.value);
			if(poll.left != null)
				queue.offer(poll.left);
			if (poll.right != null) {
				queue.offer(poll.right);
			}
		}
 	}

}
