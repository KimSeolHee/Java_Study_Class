package com.iu.object2;

public class Object2Main3 {

	public static void main(String[] args) {
		//1.객체만들기
		Method3 method = new Method3();
		//월급 입력
		int salary = 5000000;
		//변수에 값을 넣음: 인자값(메서드를 호출할 때 매개변수에 보내는 실제 값)
		method.sal(salary); //salary = 20은 호출이 끝나면 같이 사라짐
		System.out.println(salary);
		
		method.hap(10, 20);
		System.out.println(method.hap(10, 20));
		
		method.info("설희", 27, "rlatjfgml64@naver.com");
		method.info("혜림", 26, "goa6471@naver.com");
		method.info("혜현", 20, "gPgus6471@naver.com");
		
		Member member = new Member();
		member.name="서리";
		member.age=13;
		member.email = "tjjfkdfj@djfkdf";
		member.phon = "애플";
		
		method.info2(member);
		System.out.println(member.age);
		
	}
	
}

