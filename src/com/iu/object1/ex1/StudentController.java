package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentController {

	//start 메서드를 선언
	//하는일 : System.out.println("1. 학생정보 입력 2. 학생정보 조회 3. 학생정보 검색 4. 학생정보 삭제 5. 학생정보 추가 6. 프로그램 종료");
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();
		StudentView view = new StudentView();
		Student [] students= null;
		Student student = new Student();
		boolean check = true;
		while(check) {
			System.out.println("\n1. 학생정보 입력 2. 학생정보 조회 3. 학생정보 검색 4. 학생정보 삭제 5. 학생정보 추가 6. 프로그램 종료");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.println("1-학생정보를 입력해주세요");
				students = service.makeStudents();
			}else if(num == 2) {
				System.out.println("2-학생정보를 조회해주세요");
				view.viewAll(students);
			}else if(num == 3) {
				System.out.println("3-학생정보를 검색해주세요");
				student = service.findStudent(students);
				if(student != null) {
					view.viewOne(student);
				}else{
					view.viewMessage("검색 할 대상이 없습니다.");
				}
			}else if(num == 4) {
				System.out.println("4-학생정보를 삭제해주세요");
			}else if(num == 5) {
				System.out.println("5-학생정보를 추가해주세요");
			}else {
				System.out.println("프로그램 종료");
				check = false;
			}
			System.out.println("------------------------------------------------------------------------------------");
		}
	}
}
