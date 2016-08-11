package com.henugao.offer.stackandqueue;

import java.util.Stack;

/**
 * 面试题21 包含min函数的栈
 * @author henugao
 *
 */
public class MinInStack {

	private Stack<Integer> mainStack = new Stack<Integer>();
	private Stack<Integer> aidStack = new Stack<Integer>();
	
	public void pop() {
		mainStack.pop();
		aidStack.pop();
	}
	
	public void push(int value) {
		mainStack.push(value);
		if(aidStack.peek() > value) {
			aidStack.push(value);
		}else {
			aidStack.push(aidStack.peek());
		}
	}
	
	public int min() {
		return aidStack.pop();
	}

}
