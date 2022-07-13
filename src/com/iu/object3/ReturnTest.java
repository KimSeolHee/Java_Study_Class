package com.iu.object3;

import java.util.Random;
import java.util.Scanner;

public class ReturnTest {
	
	
	//메서드 호출시 숫자를 받아서 그 숫자만큼 랜덤한 수를 리턴
	public int [] makeRandom2(int count) {
		Random random = new Random();
		
		int [] arr = new int[count];
		for(int i = 0; i < arr.length;i++) {
//			int num = random.nextInt(10);
//			arr[i] = num;
			arr[i] = random.nextInt(10);
		}

		return arr;
	}

	public int makeRandom() {
		Random random = new Random();
		int num = random.nextInt(50);
		
		//return 리턴하려는 Data
		return num;
	}
	
	public void info() {
		System.out.println("실행 후 그냥 종료");
		
	}
	
	public Account makeAccount() {
//		System.out.println("안녕하세요, OO은행입니다.");
//		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		acc.title="자유 입출금";
		acc.host="iu";
		acc.numbers="12345678";
		acc.balance = 5000000L;
		
//		System.out.println("통장이름을 입력하시오");
//		title = sc.next();
//		System.out.println("예금주를 입력하시오");
//		host = sc.next();
//		System.out.println("통장번호를 입력하시오");
//		host = sc.next();
//		System.out.println("잔액을입력하시오");
//		balance = sc.nextLong();
		
		return acc;	
	}
}
