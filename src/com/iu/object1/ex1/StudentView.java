package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentView {

	//viewMessage
	//문자열을 받아서 그 문자열을 출력
	//viewAll
	//viewOne
	//학생 한명의 정보를 받아서 모든 정보를 출력.
	
	//학생들의 정보를 받아서 출력만하면됌
	Student student = new Student();
	
	//메서드명 오버로딩하여 하나로 만들 수 있다.
	//오버로딩 할 경우 Controller에서도 오버로딩된 메서드 하나로 통일
	
	public void viewAll(Student [] students) {	
		
		for(int i = 0;i < students.length;i++) {
			System.out.println("이름\t번호\t총점\t평균");
			System.out.print(students[i].name+"\t");
			System.out.print(students[i].num+"\t");
			System.out.print(students[i].total+"\t");
			System.out.println(students[i].average);
			System.out.println("====================================");
		}
	}
	
	public void viewOne(Student student) {
		System.out.println("이름\t국어\t영어\t수학");
		System.out.print(student.name+"\t");
		System.out.print(student.kor+"\t");
		System.out.print(student.eng+"\t");
		System.out.println(student.math);
		System.out.println("====================================");
	}
	
	public void viewMessage(String message) {		
		System.out.println(message);
	}
}






