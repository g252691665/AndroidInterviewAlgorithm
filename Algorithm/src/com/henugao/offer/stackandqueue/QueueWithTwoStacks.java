package com.henugao.offer.stackandqueue;

import java.util.Stack;

/**
 * 面试题7 用两个栈实现队列
 * @author henugao
 *
 */
public class QueueWithTwoStacks {
	private Stack<Integer> pushStack = new Stack<Integer>();
	private Stack<Integer> popStack = new Stack<Integer>();
	
	
	/**
	 * 入栈操作
	 * @param value
	 */
	public void push(int value) {
		popStack.push(value);
	}
	
	/**
	 * 出栈操作
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
