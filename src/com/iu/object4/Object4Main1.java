package com.iu.object4;

public class Object4Main1 {

	public static void main(String[] args) {
		Resume re = new Resume();
		
		//생성자는 특수한 메서드로 객체 호출할 때 딱 한번만 사용 됌
//		re.Resume(); XXXXXXXX
		
		Car car1 = new Car();
		Car car2 = new Car("black");
		Car car3 = new Car("orenge", "k5");
		Car car4 = new Car();
		
		car1.info();
		car2.info();
		car3.info();
		car4.info();
		

	}

}
