package com.henugao.offer.linkedlist;

import java.util.ArrayList;
import java.util.Stack;

import com.henugao.linkedlist.ListNode;

/**
 * 面试题5 从尾到头打印链表
 * 实现思路：用一个栈存储
 * @author henugao
 *
 */

public class PrintLinkedListRev {

	public static void main(String[] args) {
		ListNode node01 = new ListNode(1);
		ListNode node02 = new ListNode(2);
		ListNode node03 = new ListNode(3);
		ListNode node04 = new ListNode(4);
		node01.next = node02;
		node02.next = node03;
		node03.next = node04;
		node04.next = null;
		System.out.println("利用栈的方式");
		ArrayList list = printLinkedListRev(node01);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println("利用递归的方式：");
		ArrayList list1 = printLinkedListRev(node01);
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
	
	//利用栈
	public static ArrayList printLinkedListRev(ListNode node) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<ListNode> stack = new Stack<ListNode>();
		ListNode pNode = node;
		while(pNode != null) {
			stack.push(pNode);
			pNode = pNode.next;
		}
		int stackSize = stack.size();
		for (int i = 0; i < stackSize; i++) {
			list.add(stack.pop().data);
		}
		return list;
	}
	//利用递归的方式
	public static ArrayList printLinkedListRevRec(ListNode node) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(node != null) {
			if(node.next != null) {
				printLinkedListRevRec(node.next);
			}
			list.add(node.data);
		}
		return list;
			
	}

}
