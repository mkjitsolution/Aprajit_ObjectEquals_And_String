package p1;

public class Demo1 {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		String s3 = new String("Hello");
		String s4 = new String("hello");
		
		System.out.println(s1==s2); // true   [true] 
		System.out.println(s3==s4); // true   [false]
		
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
	}//end main
}//end class
