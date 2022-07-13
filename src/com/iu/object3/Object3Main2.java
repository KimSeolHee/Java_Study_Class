package com.iu.object3;

public class Object3Main2 {

	public static void main(String[] args) {
		Count count = new Count();
		
		//메서드 오버로딩
		count.hap(0.1f, 3.2);
		count.hap("2", 1);
		count.hap(1, 3.2);
		count.hap(50, 1);
		count.hap("2", 1.1);
		count.hap(1, 3);

	}

}
