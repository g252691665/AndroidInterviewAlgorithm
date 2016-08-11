package com.henugao.offer.stackandqueue;

import java.util.Stack;

/**
 * ������7 ������ջʵ�ֶ���
 * @author henugao
 *
 */
public class QueueWithTwoStacks {
	private Stack<Integer> pushStack = new Stack<Integer>();
	private Stack<Integer> popStack = new Stack<Integer>();
	
	
	/**
	 * ��ջ����
	 * @param value
	 */
	public void push(int value) {
		popStack.push(value);
	}
	
	/**
	 * ��ջ����
	 * @return
	 */
	public int  pop() {
		if(popStack.isEmpty()) {
			while(!pushStack.isEmpty()) {
				int value = pushStack.pop();
				popStack.push(value);
			}
		}
		int value = popStack.pop();
		return value;
		
	}


}
