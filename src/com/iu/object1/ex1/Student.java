package com.iu.object1.ex1;

public class Student {

	private String name;
	private int num;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = this.checkPoint(kor);
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = this.checkPoint(eng);
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = this.checkPoint(math);
	}
	
	public void setTotal() {
	this.total = this.kor+this.eng+this.math;
	this.setAvg();
	}
	
	public int getTotal() {
		return total;
	}
	
	private void setAvg() {
	this.average = this.total / 3;
	}

	public double getAverage() {
		return average;
	}

	
	
	private int checkPoint(int point) {
		if(point <= 0 && point >=100) {
			return 0;
		}
		return point;
	}
	
	
	
	
	
	
	//this 만들어진 객체의 주소(생략가능)
	//매개변수의 변수명과 멤버변수의 변수명이 같을 때 두개 다 지역변수가 된다.
	//지역변수와 멤버변수를 구분할 때 멤버변수에 this를 쓴다...
	
//	public void setTotal() {
//		this.total = this.kor+this.eng+this.math;
////		total = kor+eng+math;
//		this.setAvg();
//	}
//	
//	private void setAvg() {
//		this.average = this.total / 3;
////		average = total / 3;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return this.name;
//	}
//	
//
//	public void setNum(int num) {
//		if(num > 0) {
//			this.num = num;
//		}
//	}
//	public int getNum() {
//		return this.num;
//	}
//	
//	public void setKor(int kor) {
//		if(kor >= 0 && kor <= 100) {
//			this.kor = kor;
//		}
//	}
//	public int getKor() {
//		return this.kor;
//	}
//	
//	public void setEng(int eng) {
//		if(eng >= 0 && eng <= 100) {
//			this.eng = eng;
//		}
//	}
//	public int getEng() {
//		return this.eng;
//	}
//	
//	public void setMath(int math) {
//		if(math >= 0 && math <= 100) {
//			this.math = math;
//		}
//	}
//	public int getMath() {
//		return this.math;
//	}
//	
//	public int getTotal() {
//		return this.total;
//	}
//	
//	public int getAverage() {
//		return (int) this.average;
//	}
//	
//	
	
}
