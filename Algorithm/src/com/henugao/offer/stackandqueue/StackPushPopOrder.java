package com.henugao.offer.stackandqueue;

import java.util.Stack;

/**
 * ������22 ջ��ѹ�뵯������
 * @author henugao
 *
 */
public class StackPushPopOrder {

	public static void main(String[] args) {

	}
	/**
	 * 
	 * @param pushArray ѹջ����
	 * @param popArrsy  ��ջ����
	 * @param len       ջ�Ĵ�С
	 * @return
	 */
	public static boolean isPopOrder(int[] pushArray,int[] popArray,int len) {
		if(pushArray != null && popArray != null && len > 0) {
		int pNextPop = 0;  //��ջ���е�ָ��
		int pNextPush = 0;  //��ջ���е�ָ��
		
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
