package string_handling;

public class TestIntern {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		s2 = s2.intern();    //intern is used to place string object into literal pool
		String s3 = "Hello";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		

	}

}
