package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentService {
	
	Scanner sc;
	
	public StudentService() {
		this.sc = new Scanner(System.in);
	}

	//addStudent
	//학생 한명 추가
	//학생들의 정보를 받아서
	//학생들의 정보 리턴
	
	//makeStudents메서드
	//인원수 입력받고,
	//학생수 만큼 정보를 입력받고, 
	//학생들을 리턴한다.
	
	//findStudent
	//검색하고 싶은 학생의 번호를 입력받아서,
	//정보를 받아서 있는 학생과 내가 입력한 번호를 같은지 찾아서 비교
	//틀리면 두번째 학생꺼랑 내가 입력한 번호랑 비교/.... 찾을때 까지 무한은 X 학생수는 정해져있음...
	//같은 번호의 학생을 찾아서 그 학생을한명을 리턴
	//없으면 널을 리턴하세요.
	
	int count;
	public Student [] makeStudents() {
		System.out.println("학생수를 입력하세요.");
		count = sc.nextInt();
		
		Student [] students = new Student[count];
		
		for(int i = 0;i < students.length;i++) {
			Student student = new Student();
			
			System.out.println("이름을 입력하세요.");
			student.name = sc.next();
			System.out.println("번호를 입력하세요.");
			student.num = sc.nextInt();
			System.out.println("국어점수를 입력하세요.");
			student.kor = sc.nextInt();
			System.out.println("영어점수를 입력하세요.");
			student.eng = sc.nextInt();
			System.out.println("수학점수를 입력하세요.");
			student.math = sc.nextInt();
			student.setTotal();
			
			students[i] = student; 
		}
		return students;
	}
	
	
	public Student findStudent(Student [] students) {
		System.out.println("번호를 입력하세요");
		int num =sc.nextInt();
		
		Student student = null;
		for(int i = 0;i < students.length;i++) {
			if(num == students[i].num) {
				student = students[i];
				break;
			}
		}
		return student;
	}
	
	//addStudent
	//학생 한명 추가
	//학생들의 정보를 받아서
	//학생들의 정보 리턴
	
//	public Student[] addStudent(Student [] studnets) {
//		
//		System.out.println("학생정보를 추가하세요.");
//		Student [] copyStudents = new Student[students.length+1];
//		
//		Student student = new Student();
//		
//		
//		
//		for(int i = 0;i < students.length;i++) {
//			copyStudents[i] = students[i]; 
//		}
//		
//		Student student = new Student();
//		System.out.println("이름을 입력하세요.");
//		student.name = sc.next();
//		System.out.println("번호를 입력하세요.");
//		student.num = sc.nextInt();
//		System.out.println("국어점수를 입력하세요.");
//		student.kor = sc.nextInt();
//		System.out.println("영어점수를 입력하세요.");
//		student.eng = sc.nextInt();
//		System.out.println("수학점수를 입력하세요.");
//		student.math = sc.nextInt();
//		student.setTotal();
//		
//		copyStudents[students.length] = student;
//		students = copyStudents;
//		
//		return students;
//	}
//	
//}













