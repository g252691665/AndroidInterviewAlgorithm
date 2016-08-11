package com.henugao.offer.tree;

/**
 * 面试题39 二叉树的深度
 * @author henugao
 *
 */
public class TreeDepth {
	public static void main(String[] args) {

	}
	
	public static int treeDepth(BinaryTreeNode p) {
		if(p == null) 
			return 0;
		int nLeft = treeDepth(p.getLeft());
		int nRight = treeDepth(p.getRight());
		return nLeft > nRight ? nLeft +1 : nRight + 1;
	}

}
