package com.henugao.offer.linkedlist;

import com.henugao.linkedlist.ListNode;

/**
 * 合并两个有序的单链表
 * @author henugao
 *
 */
public class MergeLinkedList {

	public static void main(String[] args) {
		
	}

	public static ListNode mergeList(ListNode head1,ListNode head2) {
		if (head1 == null) {
			return head2;
		}else if(head2 == null) {
			return head1;
		}
		ListNode pMergeHead = null;
		if(head1.data < head2.data) {
			pMergeHead = head1;
			pMergeHead.next = mergeList(head1.next, head2);
		}else {
			pMergeHead = head2;
			pMergeHead.next = mergeList(head1, head2.next);
		}
		return pMergeHead;
		
	}
}
