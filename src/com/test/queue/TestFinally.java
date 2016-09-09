package com.test.queue;

public class TestFinally {
	String str = "3";

	public String getRet() {
		try {
			str="6";
			return str;
			//throw new Exception();
		//	return str;  不会执行，即使放在Exception前面，那么异常也不会执行，会存在错误
			
		} catch (Exception e) {
			
          e.printStackTrace();
		} finally {
			str="5";
			//return str;  //finally里执行return 语句不会报错，但是会曲解finally的作用，因为try语句或者catch语句才会真正有意义，finally语句的作用，
			//一般用来处理异常造成的问题，比如关闭流，数据库连接等。
		}
		System.out.println("------");  //不会执行
		System.out.println(str);   //不会执行，因为在try语句里已经执行了return
       return str;
	}

	public static void main(String[] args) {
      System.out.println(new TestFinally().getRet());;
	}
}
