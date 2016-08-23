package com.test.queue;

public class TestAbstractClassImpl extends TestAbstractClass implements TestInterface {
	@Override
	public void fun1() {
		System.out.println("this is fun-1");
	}
	@Override
	public void fun2() {
		System.out.println("this is fun2");
	}
	public void fun3(){
		System.out.println("this is fun3");
	}
	@Override
	public void ifun1() {
		System.out.println("this is ifun1 defined in interface");
		
	}
}
