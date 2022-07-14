package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		Student st = null;
		
		
		for(int i = 0;i < students.length;i++) {
			System.out.println("이름입력");
			st = new Student(); // 객체가 총 3번 생성되어야 한다!
			st.setName(sc.next());
			students[i] = st;
		}
		
		for(int i = 0;i < students.length;i++) {
			System.out.println("이름: " + students[i].getName());
		}
			
		
		System.out.println("프로그램 종료");

	}

}
