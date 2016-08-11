package com.henugao.offer.linkedlist;

import com.henugao.linkedlist.ListNode;

/**
 * 找到两个单链表的第一个公共节点
 * @author henugao
 *
 */

public class FindFirstCommonNode {

	public static void main(String[] args) {
		

	}
	
	 public static  ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		int nLength1 = getListLen(pHead1);
		int nLength2 = getListLen(pHead2);
		
		int nLenDif = nLength1 - nLength2;
		ListNode pHeadLong = pHead1;
		ListNode pHeadShort = pHead2;
		if(nLength1 < nLength2) {
			nLenDif = nLength2 - nLength1;
			pHeadLong = pHead2;
			pHeadShort = pHead1;
		}
		//先在长链表上走几步，然后再同时遍历
		for (int i = 0; i < nLenDif; i++) {
			pHeadLong = pHeadLong.next;
		}
		
		while(pHeadLong != null && pHeadShort != null 
				&& pHeadLong != pHeadShort) {
			pHeadLong = pHeadLong.next;
			pHeadShort = pHeadShort.next;
		}
		 return pHeadLong;
		 
	 }
	 
	 /**
	  * 求给定链表的长度
	  * @param head
	  * @return
	  */
	 public static int getListLen(ListNode head) {
		 int num = 0;
		 while(head != null) {
			 num++;
			 head = head.next;
		 }
		 return num;
	 }

}
