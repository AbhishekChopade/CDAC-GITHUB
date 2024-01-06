package sets2;

import java.util.Scanner;

public class TestMe3 {

	public static void main(String[] args) {
		// BBBB AaBB AaAa BBAa
		Scanner sc = new Scanner(System.in);
		System.out.println("BBBB".equals("AaBB"));
		System.out.println("BBBB".equals("AaAa"));
		System.out.println("BBBB".equals("BBAa"));
		System.out.println("BBBB".hashCode());
		System.out.println("AaBB".hashCode());
		System.out.println("AaAa".hashCode());
		System.out.println("AaAa".hashCode());
		System.out.println("Enter the 1st string");
		String s1 = sc.next();
		System.out.println(s1.hashCode());
		System.out.println("Enter the 2nd string");
		String s2 = sc.next();
		System.out.println(s2.hashCode());

	}

}
