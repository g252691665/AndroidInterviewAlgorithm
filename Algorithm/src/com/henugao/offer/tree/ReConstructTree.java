package com.henugao.offer.tree;


/**
 * 面试题6 重建二叉树
 * @author henugao
 *
 */
public class ReConstructTree {


	public static void main(String[] args) {

	}
	
	
	public static BinaryTreeNode reconstruceTree(char[] pre,int preStart,int preEnd,
			char[] in,int inStart,int inEnd) {
		 if(preStart>preEnd||inStart>inEnd)
	            return null;
		 BinaryTreeNode root = new BinaryTreeNode(pre[preStart]);
		 
		 for (int i = inStart; i < inEnd; i++) {
			if(in[i] == pre[preStart]) {
				root.left = reconstruceTree(pre,preStart + 1,preStart + i -inStart,in,inStart,i - 1);
				root.right = reconstruceTree(pre, preStart +i - inStart + 1, preEnd, in, i+1, inEnd);
			}
 		}
		 return root;
	}
					
    


}
