package com.iu.object3;

public class Count {

	//Overoading 메서드 이름 동일, 매개변수 갯수나 타입이 다름.
	//변수명과는 상관없다.
	
	public void hap(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public void hap(int num1, double num2) {
		System.out.println(num1+num2);
	}
	
	public void hap(float num1, double num2) {
		System.out.println(num1*num2);
	}
	
	public void hap(float num1, short num2) {
		System.out.println(num1*num2);
	}
	
	public void hap(float num1, int num2) {
		System.out.println(num1*num2);
	}
	
	public void hap(double num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void hap(byte num1, double num2) {
		System.out.println(num1*num2);
	}
	
	public void hap(String num1, double num2) {
		System.out.println(num1+num2);
	}
}
