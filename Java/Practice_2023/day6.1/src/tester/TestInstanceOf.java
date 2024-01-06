package tester;

import inheritance.*;

public class TestInstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person p1 = new Person("abc","xyz");
//		Object obj =new Student(null, null, 0, null, 0, 0);
		Person p1 = new Student(null, null, 0, null, 0, 0);
		//Object obj =new Person("abc","xyz");
		System.out.println(p1 instanceof Person);
		System.out.println(p1 instanceof Student);
//		System.out.println(obj instanceof Object);
//		System.out.println(obj instanceof Person);
	}

}
