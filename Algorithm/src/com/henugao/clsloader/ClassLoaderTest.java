package com.henugao.clsloader;

public class ClassLoaderTest {

	public static void main(String[] args) throws ClassNotFoundException {
		//�鿴��ǰϵͳ·���а�����·����Ŀ
		System.out.println(System.getProperty("java.class.path"));
		//���ü��ص�ǰ����������
		Class typeLoader = Class.forName("com.henugao.clsloader.TestBean");
		System.out.println(typeLoader.getClassLoader());
	}

}
