package com.iu.object4;

public class Car {

	String company = "쌍용";
	String brand = "토레타";
	String color;
	boolean gear; //true면 오토, false 수동

	//Instance 초기화 블록 {}	
//	{
//		this.company="기아";
//		this.brand = "k5";
//		this.color = "red";
//	}
	
	public void info() {
		System.out.println("=================");
		System.out.println("Company: " + this.company);
		System.out.println("Brand: " + this.brand);
		System.out.println("Color: " + this.color);
		System.out.println("Gear: " + this.gear);
	}

	//빈생성자를 만들어서 기본 색을 green으로 지정하고
	//다른 색을 넣고싶을때 아래 생성자에 매개변수로 색을 지정한다.
	//생성자내에서 또다른 생성자를 생성할때 this();
	public Car() {
		this("red");
		this.color = "green";
	}
	
	public Car(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
	
	//멤버변수 초기화 및 객체 생성 시 일을 하고 싶을 때
	public Car(String color) {
//		System.out.println("Car 객체 생성!");
//		this.company = "현대";
//		this.brand = "아반떼";
//		this.color = color;
//		this.gear = false;
//		System.out.println("gg");
		this("white", "아반떼"); //생성자 영역 내 첫줄에 위치 해야함.
	}
}
