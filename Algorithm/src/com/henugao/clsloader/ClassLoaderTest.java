package com.henugao.clsloader;

public class ClassLoaderTest {

	public static void main(String[] args) throws ClassNotFoundException {
		//查看当前系统路径中包含的路径条目
		System.out.println(System.getProperty("java.class.path"));
		//调用加载当前类的类加载器
		Class typeLoader = Class.forName("com.henugao.clsloader.TestBean");
		System.out.println(typeLoader.getClassLoader());
	}

}
