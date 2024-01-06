package string_handling;

public class Test7 {

	public static void main(String[] args) {
//		String s1="hello";
//		String s2="hello";
//		String s3=new String(s1);
//		String s4=s3.intern();
//		String s9=new String(s1.toUpperCase());
//                String s10=s9.intern();
//		//concat vs + operator
		String s1="hello";
		String s2="hello";
		String s3="he";
		String s4="llo";
		String s5="he"+"llo";// lietral + literal = new literal string in literal pool
		String s6=s3+s4;  //ref+ref = new instance will be created outside string pool
		String s7 =  new String(s1);
		
		System.out.println("s1= "+s1);
		System.out.println("s2= "+s2);
		System.out.println("s5= "+s5);
		System.out.println("s6= "+s6);
		System.out.println("s7= "+s7);
		System.out.println(s1==s2);//t
		System.out.println(s1==s5);//t
		System.out.println(s1==s6);//f
		System.out.println(s1==s7);//f

		
	}

}
