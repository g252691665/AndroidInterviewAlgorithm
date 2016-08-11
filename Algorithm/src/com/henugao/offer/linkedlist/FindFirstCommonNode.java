package com.henugao.offer.linkedlist;

import com.henugao.linkedlist.ListNode;

/**
 * �ҵ�����������ĵ�һ�������ڵ�
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
		//���ڳ��������߼�����Ȼ����ͬʱ����
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
	  * ���������ĳ���
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
