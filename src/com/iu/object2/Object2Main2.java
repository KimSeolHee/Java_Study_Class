package com.iu.object2;

import java.util.Scanner;

public class Object2Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		AnimalSound sd = new AnimalSound();
		boolean check = true;
	
		while(check) {
			System.out.println("1. Dog\t2.Cat\t3.Tiger");
			int select = sc.nextInt();
			System.out.println("횟수");
			int count = sc.nextInt();
			
			for(int i = 0;i < count;i++) {
				if(select==1) {
					sd.dogSound();
				}else if(select == 2) {
					sd.catSound();
				}else if(select == 3){
					sd.tigerSound();
				}else {
					check = !check;
				}
			}
		}
	}

}
