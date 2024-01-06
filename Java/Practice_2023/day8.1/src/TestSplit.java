import java.util.Arrays;

public class TestSplit {

	public static void main(String[] args) {
		String s1 = "He is a very very good boy, isn't he?";
		//String[] token = s1.split("[^a-zA-Z]");
		int numTokens = 0;
		String[] token = {"abc","","xyz"};
		System.out.println(Arrays.toString(token));
		System.out.println(token.length);
		for (int i=0; i<token.length; ++i) 
          if (token[i].length() > 0) 
              numTokens++;
		System.out.println(numTokens);
	}

}

//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class TestSplit {
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String S = sc.nextLine();
//         String[] tokens = S.split("[^a-zA-Z]");
//         int numTokens = 0;
//         System.out.println(Arrays.toString(tokens));
// 		 System.out.println(tokens.length);
//         for (int i=0; i<tokens.length; ++i) 
//             if (tokens[i].length() > 0) 
//                 numTokens++;
//             
//         System.out.println(numTokens);
//        
//         for (int i=0; i<tokens.length;++i)
//             if (tokens[i].length() > 0)
//                 System.out.println(tokens[i]);
//    }
//}
