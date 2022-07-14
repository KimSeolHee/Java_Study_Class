package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		
		for(int i=0;i<students.length;i++) {
			Student st = new Student();
			students[i] = st;
			System.out.println("이름입력");
//			students[i].name=sc.next(); 2가지 방법 가능/ 동일한 주소를 보고 있으므로 동일하게 바뀜.
			st.setName( sc.next());
		}
		
		for(int i = 0;i < students.length;i++) {
			System.out.println("이름: " + students[i].getName());
		}

	}

}
