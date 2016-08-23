package com.test.queue;

public class TestAbstract {
	public static void main(String[] args) {
		TestAbstractClass t1 = new TestAbstractClassImpl();
		t1.fun1();
		// t1.fun3(); 父类是没有办法访问子类单独有的方法的
		t1.fun2();
		TestInterface inter = new TestAbstractClassImpl();
		inter.ifun1();
		//inter.fun2(); 接口没有办法访问实现类的
		TestAbstractClassImpl impl=new TestAbstractClassImpl();
		impl.fun1();//自身可以反问自己定义的所有方法
		
	}
}
