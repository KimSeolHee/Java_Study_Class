package com.iu.object2;

public class Method3 {

	//메서드 선언     //매개변수 선언
	//매개변수의 데이터타입은 제한없음
	//매개변수는 선언된 메서드 내에서 사용하는 지역변수
	public void sal(int salary) {
		System.out.println("월급 계산");
		System.out.println((int)(salary * 0.967)+"원");
		salary = 20;
	}
	
	//void는 리턴값이 없음
	//타입을 모를땐 void작성
	public int hap(int num, int num2) {
		return num+num2;
	}
	
	public void info(String name, int age, String email) {
		System.out.println("이름: " + name + "\t 나이: " + age + "\t 이메일: " + email);
	}
	
	public void info2(Member member) {
		System.out.println(member.name);
		System.out.println(member.age);
		System.out.println(member.email);
		System.out.println(member.phon);
		member.age = 100;
	}
}
