package com.henugao.offer.linkedlist;

import com.henugao.linkedlist.ListNode;

import com.henugao.linkedlist.ListNode;


/**
 * 链表倒数第K个节点
 * @author henugao
 *
 */
public class KthNodeFromEnd {

	public static void main(String[] args) {

	}
	
	public  static ListNode getKthNodeFromEnd(ListNode head,int k) {
		//空链表或者是倒数第0个节点
		if(head == null || k == 0)
			return null;
		ListNode pFirstNode = head;
		ListNode pSecondNode = null;
		for (int i = 0; i < k - 1; i++) {
			if (pFirstNode.next != null) { //判断链表中的节点是否小于k
				pFirstNode = pFirstNode.next;
			}else {
				return null;
			}
		}
		pSecondNode = head;
		while(pFirstNode.next != null) {
			pFirstNode = pFirstNode.next;
			pSecondNode = pSecondNode.next;
		}
		return pSecondNode;
		
	}

}
