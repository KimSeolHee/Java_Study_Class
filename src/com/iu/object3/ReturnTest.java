package com.iu.object3;

import java.util.Random;

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
}
