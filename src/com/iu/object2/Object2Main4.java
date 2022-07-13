package com.iu.object2;

public class Object2Main4 {

	public static void main(String[] args) {

		Member member = new Member();
		member.name = "서리";
		member.age = 10;
		member.email = "tjfgml@naver.com";
		
		Member member2 = new Member();
		member2.name = "혜림";
		member2.age = 20;
		member2.email = "goa@naver.com";
		
		Member member3 = new Member();
		member3.name = "설이";
		member3.age = 30;
		member3.email = "gkjdkfjd@naver.com";

		Member [] members = new Member[3];
		
		members[0] = member;
		members[1] = member2;
		members[2] = member3;
		
		Method4 method4 = new Method4();
		
		method4.info(members);
		
		System.out.println(members.length);
	}

}
