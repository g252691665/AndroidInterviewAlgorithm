package com.henugao.offer.tree;

/**
 * 面试题18 树的子结构
 * @author henugao
 *
 */
public class HasSubTree {

	public static void main(String[] args) {

	}
	
	public static boolean hasSubTree(BinaryTreeNode pRoot1,BinaryTreeNode pRoot2) {
		boolean result = false;
		if(pRoot1 != null && pRoot2 != null) {
			if(pRoot1.getValue() == pRoot2.getValue()) {
				result = doesTree1HaveTree2(pRoot1,pRoot2);
			}
			if(!result) {
				result = hasSubTree(pRoot1.getLeft(),pRoot2);
			}
			if(!result) {
				result = hasSubTree(pRoot1.getRight(),pRoot2);
			}
		}
		return result;
	}
	
	public static boolean doesTree1HaveTree2(BinaryTreeNode pRoot1,BinaryTreeNode pRoot2) {
		if(pRoot2 == null) 
			return true;
		if(pRoot1 == null) 
			return false;
		if(pRoot1.getValue() != pRoot2.getValue())
			return false;
		return doesTree1HaveTree2(pRoot1.getLeft(), pRoot2.getLeft()) &&
				doesTree1HaveTree2(pRoot1.getRight(), pRoot2.getRight());
	}

}
