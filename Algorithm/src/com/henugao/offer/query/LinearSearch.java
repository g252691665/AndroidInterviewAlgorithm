package com.henugao.offer.query;
import java.util.Scanner;

/**
 * ˳�����
 * @author henugao
 *
 */
public class LinearSearch {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7};
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ��ѯ������");
		while(scanner.hasNext()) {
			int key = scanner.nextInt();
			int result = linearSearch(data, key);
			if(result != -1)
				System.out.println("�����ڵ�" + (result+1) + "��λ��");
			System.out.println("����������");
		}
	}
	
	public static int linearSearch(int[] data,int key) {
		if(data == null || data.length <= 0) {
			return -1;
		}
		for (int i = 0; i < data.length; i++) {
			if(data[i] == key)
				return i;
		}
		return -1;
	}

}
