package com.iu.object3;

public class Object3Main1 {

	public static void main(String[] args) {
		ReturnTest rt = new ReturnTest();
		rt.info();
		int num = rt.makeRandom();
		System.out.println(num);
		System.out.println("===============================================");
		
		int [] nums = rt.makeRandom2(10);
		
		for(int i = 0;i <nums.length;i++) {
			System.out.println(nums[i]);
		}
		
	}

}
