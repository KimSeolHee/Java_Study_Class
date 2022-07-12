package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작\n");
		
//		Student student1 = new Student();
//		student1.name = "김설희";
//		student1.kor = 100;
//		student1.eng = 100;
//		student1.math = 95;
//		student1.total = student1.kor+student1.eng+student1.math;
//		student1.average = student1.total / 3;
		
//		Student student2 = new Student();
//		Student student3 = new Student();

//		System.out.println("학생이름: " + student1.name);
//		System.out.println("국어성적: " + student1.kor+"점");
//		System.out.println("영어성적: " + student1.eng+"점");
//		System.out.println("수학성적: " + student1.math+"점");
//		System.out.println("총점: " + student1.total+"점");
//		System.out.println("평균: " + student1.average+"점\n");
		
		
		Scanner sc = new Scanner(System.in);
		Student st = null;
		
		//Student 타입을 넣어줘야함.
		Student [] students = new Student[3];
		
		for(int i = 0;i<students.length;i++) {
			st = new Student();
			System.out.println("이름 입력");
			st.name = sc.next();
			students[i] = st;
		}
		
		System.out.println(students[0].name);
		System.out.println(students[1].name);
		System.out.println(students[2].name);
		
		System.out.println(st.name);
		
		
		System.out.println("프로그램 종료");
	}

}
