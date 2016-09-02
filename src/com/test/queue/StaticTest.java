package com.test.queue;

public class StaticTest {

	static{
		System.out.println("静态代码块");
	}
	public static void initApp(){
		///
		System.out.println("进入静态方法！");
	}
	public static void main(String[] args) {
		System.out.println("main");
	}
}
