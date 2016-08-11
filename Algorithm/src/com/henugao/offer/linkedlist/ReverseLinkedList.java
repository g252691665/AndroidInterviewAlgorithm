package com.henugao.offer.linkedlist;

import com.henugao.linkedlist.ListNode;

/**
 * 反转单链表
 * @author henugao
 *
 */
public class ReverseLinkedList {

	public static void main(String[] args) {

	}
	
	public static ListNode reverseList(ListNode head) {
		ListNode pReverseNode = null;
		ListNode pPrev = null;
		ListNode pNode = head;
		while(pNode != null) {
			ListNode pNext = pNode.next;
			if(pNext == null) {
				pReverseNode = pNode;
			}
			pNode.next = pPrev;
			pPrev = pNode;
			pNode = pNext;
		}
		return pReverseNode;
	}

}
