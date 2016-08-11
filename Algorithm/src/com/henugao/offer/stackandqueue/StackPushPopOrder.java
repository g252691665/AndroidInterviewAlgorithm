package com.henugao.offer.stackandqueue;

import java.util.Stack;

/**
 * 面试题22 栈的压入弹出序列
 * @author henugao
 *
 */
public class StackPushPopOrder {

	public static void main(String[] args) {

	}
	/**
	 * 
	 * @param pushArray 压栈序列
	 * @param popArrsy  出栈序列
	 * @param len       栈的大小
	 * @return
	 */
	public static boolean isPopOrder(int[] pushArray,int[] popArray,int len) {
		if(pushArray != null && popArray != null && len > 0) {
		int pNextPop = 0;  //出栈序列的指针
		int pNextPush = 0;  //入栈序列的指针
		
		Stack<Integer> aidStack = new Stack<Integer>();
		while(pNextPop < len) {
			while(aidStack.isEmpty() || aidStack.peek() != popArray[pNextPop]){
				if(pNextPush == len) {
					break;
				}
				aidStack.push(pushArray[pNextPush]);
				pNextPush++;
			}
			if(aidStack.peek() != popArray[pNextPop]) {
				break;
			}
			aidStack.pop();
			pNextPop ++;
		}
		if(aidStack.isEmpty() && pNextPop == len)
			return true;
		}
		
		return false;
	}

}
