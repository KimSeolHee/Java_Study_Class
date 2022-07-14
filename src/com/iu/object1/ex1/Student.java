package com.iu.object1.ex1;

public class Student {

	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	double average;
	
	//this 만들어진 객체의 주소(생략가능)
	//매개변수의 변수명과 멤버변수의 변수명이 같을 때 두개 다 지역변수가 된다.
	//지역변수와 멤버변수를 구분할 때 멤버변수에 this를 쓴다...
	
	public void setTotal() {
		this.total = this.kor+this.eng+this.math;
//		total = kor+eng+math;
		this.setAvg();
	}
	
	public void setAvg() {
		this.average = this.total / 3;
//		average = total / 3;
	}
}
