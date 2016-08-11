package com.henugao.offer.linkedlist;

import com.henugao.linkedlist.ListNode;

import com.henugao.linkedlist.ListNode;


/**
 * ��������K���ڵ�
 * @author henugao
 *
 */
public class KthNodeFromEnd {

	public static void main(String[] args) {

	}
	
	public  static ListNode getKthNodeFromEnd(ListNode head,int k) {
		//����������ǵ�����0���ڵ�
		if(head == null || k == 0)
			return null;
		ListNode pFirstNode = head;
		ListNode pSecondNode = null;
		for (int i = 0; i < k - 1; i++) {
			if (pFirstNode.next != null) { //�ж������еĽڵ��Ƿ�С��k
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
