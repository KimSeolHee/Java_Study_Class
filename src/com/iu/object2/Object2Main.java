package com.iu.object2;

public class Object2Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작\n");
		
		Method1 mt1 = new Method1();
		//멤버변수 사용
		//참조변수명.변수명
		
		//멤버메서드 사용(메서드를 호출)
		//참조변수명.메서드명()
		
		mt1.test();
		
//		System.out.println(num); test()안의 지역변수는 호출 후 사라짐.
		
		Method2 mt2 = new Method2();
		mt2.info();
		
		System.out.println("\n프로그램 종료");
		
	}
	
}
