package string_handling;

import java.util.Date;

//mutable StringBuilder
public class TestByMe {

	public static void main(String[] args) {
		// inits a new SB with specified string , n allocates 16 chars
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.length()+" "+sb1.capacity());
		sb1 = new StringBuilder("test");
		System.out.println(sb1);// testing
		System.out.println("len= " + sb1.length() + " capa " + sb1.capacity());// 7 23
		StringBuilder sb2=sb1.append(false);
		System.out.println(sb1.length()+" "+sb1.capacity());
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb1==sb2);
		sb1.append(true);
		System.out.println(sb1.length()+" "+sb1.capacity());
		sb1.append('c');
		System.out.println(sb1.length()+" "+sb1.capacity());
		sb1.append(123.45);
		System.out.println(sb1.length()+" "+sb1.capacity());
		sb1.append(34.678f);
		System.out.println(sb1.length()+" "+sb1.capacity());
		sb1.append(new Date());
		System.out.println(sb1.length()+" "+sb1.capacity());
		System.out.println("-----------------------------------");
//		//method chaining
//		sb2=sb1.append('c').append(123.45).
//		append(34.567f).append(new Date());
		System.out.println(sb2);
		System.out.println(sb1);
		char[] chars= {'a','b','c'};
		sb1.insert(10,chars);
		System.out.println(sb1);
		System.out.println(sb1.length()+" "+sb1.capacity());
		sb1.delete(0,sb1.length());
		System.out.println("sb contents "+sb1);
		System.out.println(sb1.length()+" "+sb1.capacity());
		sb1.trimToSize();//tries to reduce  capa=length
		System.out.println(sb1.length()+" "+sb1.capacity());
		StringBuilder s3 = new StringBuilder("Abhishek");
		StringBuilder s4 = new StringBuilder("Abhishek");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));///StringBuilder has not overridden equals method , so equality done by ref
		
	}

}
