package com.iu.object2;

public class Method4 {

	//info
	//member들의 정보를 출력하는 메서드 배열에 담겨져있는 애들 받아서 이름나이이메일주소 전부 출력
	
	public void info(Member [] members) {
		for(int i = 0;i<members.length;i++) {
			System.out.println(members[i].name);
			System.out.println(members[i].age);
			System.out.println(members[i].email);
		}
		
		members = new Member[2];
		
	}
}
