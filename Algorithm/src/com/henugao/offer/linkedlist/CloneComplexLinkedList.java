package com.henugao.offer.linkedlist;

import com.henugao.linkedlist.ComplexListNode;

/**
 * ¸´ÔÓÁ´±íµÄ¸´ÖÆ
 * @author henugao
 *
 */
public class CloneComplexLinkedList {

	public static void main(String[] args) {

	}
	
	public static ComplexListNode cloneComplexLinkedList(ComplexListNode head) {
		cloneNodes(head);
		connectSiblingNodes(head);
		ComplexListNode cloneHead = reconnectNodes(head);
		return cloneHead;
	}
	
	public static void cloneNodes(ComplexListNode head) {
		ComplexListNode pNode = head;
		while(pNode != null) {
			ComplexListNode cloneNode = new ComplexListNode();
			cloneNode.data = pNode.data;
			cloneNode.next = pNode.next;
			cloneNode.sibling = null;
			pNode.next = cloneNode;
			pNode = cloneNode.next;
		}
	}
	
	public static void connectSiblingNodes(ComplexListNode head) {
		ComplexListNode pNode = head;
		while(pNode != null) {
			ComplexListNode pCloneNode = pNode.next;
			if(pNode.sibling != null) {
				pCloneNode.sibling = pNode.sibling.next;
			}
			pNode = pCloneNode.next;
		}
	}
	
	public static ComplexListNode reconnectNodes(ComplexListNode head) {
		ComplexListNode pNode = head;
		ComplexListNode cloneHead = null;
		ComplexListNode pCloneNode = null;
		if(pNode != null) {
			cloneHead = pNode.next;
			pCloneNode = cloneHead;
			pNode.next = pCloneNode.next;
			pNode = pNode.next;
		}
		while(pNode != null) {
			pCloneNode.next = pNode.next;
			pCloneNode = pCloneNode.next;
			pNode.next = pCloneNode.next;
			pNode = pNode.next;
		}
		return cloneHead;
	}

}
