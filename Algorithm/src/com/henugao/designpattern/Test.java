package com.henugao.designpattern;


class X {
	Y y = new Y();
	public X() {
		System.out.println("x");
	}
}
class Y {
	public Y() {
		System.out.println("Y");
	}
}
public class Test extends X {
	Y y = new Y();
	public Test() {
		System.out.println("test");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num  = 10;
//		System.out.println(test(num));
		new Test();
		

	}
	
	
	
//	public static int test(int b) {
//		try {
//			b += 10;
//			return b;
//		}
//		catch(RuntimeException e) {
//			
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
//		finally {
//			b +=10;
//			return b;
//		}
//	}

}
