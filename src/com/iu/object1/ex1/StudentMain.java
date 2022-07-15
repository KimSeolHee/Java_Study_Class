package com.iu.object1.ex1;

public class StudentMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//StudentController의 start라는 메서드를 호출.

		StudentController stCon = new StudentController();	
		stCon.start();
		
		System.out.println("\n프로그램 종료");
	}

}

