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
			student.setName(sc.next());
			System.out.println("번호를 입력하세요.");
			student.setNum(sc.nextInt());
			System.out.println("국어점수를 입력하세요.");
			student.setKor(sc.nextInt());
			System.out.println("영어점수를 입력하세요.");
			student.setEng(sc.nextInt());
			System.out.println("수학점수를 입력하세요.");
			student.setMath(sc.nextInt());
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
			if(num == students[i].getNum()) {
				student = students[i];
				break;
			}
		}
		return student;
	}
	
	
	//removeStudent
	//학생들의 정보를 받는다.매개변수에서 학생들 배열의 정보들을 받는다.
	//삭제하려는 학생의 번호를 입력받아서
	//학생의 배열길이까지 입력받은 번호와 학생의 번호를 비교한다.
	//번호가 같으면 true가 되어 빠져나간다.(아래코드를 실행하기위해)
	//true일때 삭제된 새로운 배열을 만들어서 
	//새로운 삭제된 배열을 돌리는데
	//만약에 삭제할번호와 일치한 배열 제외하고 다 기존배열에 있는걸 새로운 배열[index]에 넘기고
	//일치한 번호를 가진 애들은 제외할때 그냥 다시 올라간다continue;
	//새로운 배열을 기존배열에 넘기고 
	//기존배열을 리턴한다.
	
	public Student[] removeStudent(Student[] students) {
		System.out.println("삭제할 번호를 입력하세요.");
		int deleteNum = sc.nextInt();
		
		boolean flag = false;
		int i;
		for(i = 0;i<students.length;i++) {
			if(deleteNum == students[i].getNum()) {
				flag = !flag;
				break;
			}
		}
		
		if(flag) {
			Student[] copyStudent = new Student[students.length-1];
			
			int index = 0;
			for(int j = 0;j < students.length;j++) {
				if(i == j) {
					continue;
				}
				copyStudent[index] = students[j];
				index++;
			}
			students = copyStudent;
		}
		return students;
	}
	
	
	

	
	//addStudent
	//새로운 배열을 만든다
	//새로운 배열안에 기존 배열정보를 넣는다.
	//학생정보입력(기존과 동일)
	//새로 만든 배열을 기존 배열에 주소값을 넣는다.
	//새로운 배열 마지막 부분에 새로운 student 정보가 담긴 주소값을 넣어줌
	//마지막으로 배열 정보를 리턴해준다.
	
	public Student[] addStudent(Student[] students) {
		System.out.println("추가할 학생을 입력해주세요.");
		
		Student [] copyStudents = new Student[students.length+1];
		
		for(int i = 0;i < students.length;i++) {
			copyStudents[i] = students[i];
		}
		
		Student student = new Student();
		System.out.println("학생이름");
		student.setName(sc.next());
		System.out.println("번호를 입력하세요.");
		student.setNum(sc.nextInt());
		System.out.println("국어점수를 입력하세요.");
		student.setKor(sc.nextInt());
		System.out.println("영어점수를 입력하세요.");
		student.setEng(sc.nextInt());
		System.out.println("수학점수를 입력하세요.");
		student.setMath(sc.nextInt());
		student.setTotal();
		
		copyStudents[students.length] = student;
		
		students = copyStudents;
		
		return students;
	}
	
}













