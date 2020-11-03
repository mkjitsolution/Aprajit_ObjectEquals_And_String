package p1;

public class MainClass {

	public static void main(String[] args) {
		
		Student s1 = new Student("mike", 77);
		Student s2 = new Student("mike", 77);
		
		boolean isSame = (s1 == s2);
		System.out.println(isSame);
		
		boolean isSame2 = (s1.equals(s2));
		System.out.println(isSame2);
		
		
		
		
	}
}
