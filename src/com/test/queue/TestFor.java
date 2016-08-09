package com.test.queue;

public class TestFor {
	public static void aa(){
		synchronized (TestFor.class) {
			while (true) {
				try {
					System.out.println("aaa");
					TestFor.class.wait();
					System.out.println("bbbb");

				} catch (Exception e) {
					//LOG.error("Dubbo 系统错误，具体信息为：" + e.getMessage(), e);
					e.printStackTrace();
				}
			}
		}
	}
public static void main(String[] args) {
	/*for(;;){
		System.out.println("hello word");
	}*/
	aa();
}
}
