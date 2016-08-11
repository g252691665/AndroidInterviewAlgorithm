package com.henugao.offer.tree;

/**
 * 面试题24 二叉搜索树的后序遍历序列
 * @author henugao
 *
 */
public class VerifySquenceOfBST {

	public static void main(String[] args) {

	}
	
	public static boolean verify(int arr[],int start,int end) {
		int root = arr[end];
		
		int i = start;
		for (; i < end ; i++) {
			if(arr[i] > root)
				break;
		}
		
		int j = i;
		for (; j < end; j++) {
			if(arr[j] < root)
				return false;
		}
		
		boolean left = true;
		if(i > start) 
			left = verify(arr,start,i - 1);
		
		boolean right = true;
		if(i < end)
			right = verify(arr, i, end - 1);
		
		return left && right;
	}

}
