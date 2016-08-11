package com.henugao.offer.tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 面试题 25 二叉树和为某一值的路径
 * @author henugao
 *
 */
public class FindPath {

	public static void main(String[] args) {

	}

	public static void findPath(BinaryTreeNode root,int expectedSum) {
		if(root == null)
			return;
		Stack<Integer> path = new Stack<Integer>();
		int currentSum = 0;
		findPath(root, expectedSum,currentSum,path);
	}
	
	public static void findPath(BinaryTreeNode root,int expectedSum,int currentSum,Stack<Integer> path) {
			currentSum += root.getValue();
			path.push((int) root.getValue());
			if(root.getLeft() == null && root.getRight() == null
					&& currentSum == expectedSum) {
				for (int i = 0; i < path.size(); i++) {
					System.out.println(path.get(i));
				}
			}
			if(root.getLeft() != null) 
				findPath(root.getLeft(), expectedSum, currentSum, path);
			if (root.getRight() != null) {
				findPath(root.getRight(), expectedSum, currentSum, path);
			}
			path.pop();
		
	}
}
