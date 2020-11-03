package p1;

public class StringAPIDemo {

	public static void main(String[] args) {
		
		String str = "ashish gmail com";
		
		//str = str.replace('@','#');
		System.out.println(str);
		
		
		String str2 = "0123456789";
		String s1 = str2.substring(5);
		System.out.println(""+s1);
		
		String s2 = str2.substring(5, 8);
		System.out.println(s2);
		
		
		char ch[] = str.toCharArray();
		for (char c : ch) {
			System.out.println(c);
		}
		
		char ch2 = str.charAt(4);
				
		String input = "   ffrgte  ";
		System.out.println(input.length());
		input = input.trim();
		System.out.println(input.length());
		
		
		
		System.out.println(" -------------");
		
		
		String arr[] = str.split(" ");
		for (String data : arr) {
			System.out.println(data);
		}
	}//end class
}//end main















