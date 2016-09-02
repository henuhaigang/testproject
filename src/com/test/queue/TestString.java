
public class TestString {

	public static void main(String[] args) {
		String str1 = new String("abc"); 
		String str2 = new String("abc"); 
		String str3 = "abc"; 
		String str4 = "abc"; 
		String str5 = "ab"+"c"; 
		Integer b=4;
		Integer c=4;
		Integer d=5;
		Integer f=4+1;
		System.out.println(d==f);  //true
		System.out.println(b.equals(c)); //true
		System.out.println(b==c); 	//true
		System.out.println(str1 == str2); //false
		System.out.println(str1 == str3); //false
		System.out.println(str3 == str4); //true 
		System.out.println(str4 == str5); //true 
	}
}
