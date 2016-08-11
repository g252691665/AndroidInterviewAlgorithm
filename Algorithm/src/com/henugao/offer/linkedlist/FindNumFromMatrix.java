package com.henugao.offer.linkedlist;

import java.util.Scanner;

/**
 * ������3 ����һ���������ж��������Ƿ��������һ������
 * @author henugao
 *
 */

public class FindNumFromMatrix {


	public static void main(String[] args) {
		int[][] matrix = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		int rowLen = matrix.length;
		int columnLen = matrix[0].length;
		Scanner scan = new Scanner(System.in);
		System.out.println("������Ҫ���ҵ�������");
		while(scan.hasNext()) {
			int num = scan.nextInt();
			if(num == 888) {
				System.out.println("ллʹ��");
				break;
			}
			boolean found = find(matrix,rowLen,columnLen,num);
			if (found) {
				System.out.println("�ҵ���");
			}else {
				System.out.println("û���ҵ�");
			}
			System.out.println("������Ҫ���ҵ�������");
		}

	}
	
	public static boolean find(int[][] matrix,int rowLen,int columnLen,int num) {
		boolean found = false;
		int row = 0;
		int column = columnLen - 1;
		while(row < rowLen && column >= 0) {
			if(matrix[row][column] == num) {
				found = true;
				break;
			}else if(matrix[row][column] > num) {
				column --;
			}else {
				row ++;
			}
		}
		return found;
		
	}

}
