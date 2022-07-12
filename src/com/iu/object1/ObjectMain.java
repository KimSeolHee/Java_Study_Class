package com.iu.object1;

public class ObjectMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//Object 생성
		//클래스명 변수명 = new 클래스명(); → 앞의 클래스명 == 데이터타입 → 뒤의 클래스명 생성자
		//몬스터명은 힙에 담겨져 있다. 변수명에 주소가 참조 되어있다.(참조타입)
		//데이터타입 변수명; → 변수선언
		Monster monster = new Monster();
		System.out.println(monster);
		//멤버변수 접근
		//변수명(주소).멤버변수명
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		monster.name = "오크";
		monster.hp = 100;
		monster.level = 5;
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		System.out.println("===============================");
		
		Monster monster1 = new Monster();
		monster1.name = "트롤";
		monster1.hp = 30;
		monster1.level = 3;
		System.out.println(monster1.name);
		System.out.println(monster1.level);
		System.out.println(monster1.hp);
		System.out.println(monster==monster1);
		
		Weapon sword = new Weapon();
		sword.name = "단검";
		sword.damage = 10;
		sword.inchant = 1;
		
		monster.weapon = sword;//같은 타입끼리 담을 수 있다.
		
		System.out.println(monster.weapon.name);
		
		//멤버를 사용하려고 하는데 객체가 없다..에러
//		System.out.println(monster1.weapon.name);

//		System.out.println(monster1.weapon);
		
		
		System.out.println("프로그램 종료");
	}

}
