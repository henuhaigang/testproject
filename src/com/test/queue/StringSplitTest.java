package com.test.queue;

public class StringSplitTest {
	public static void main(String[] args) {
		String time = "2016-12-13";
		
		String[] s=time.split("-");
		StringBuffer sb1=new StringBuffer();
		for(int i=0;i<s.length;i++){
			sb1.append(s[i]);
		}
		String ss=sb1.toString()+"000000";
		//String a = new String(time.split("-"))+ "000000";
		System.out.println(ss);
		//测试session在cookie中的
		 String sessionInCookie = System.getenv("Session.In.Cookie");
		 System.out.println(sessionInCookie);
		 //new String();
		//System.out.println(new String(null));
	}
}
