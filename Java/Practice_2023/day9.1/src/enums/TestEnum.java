package enums;

import java.util.Scanner;

public class TestEnum {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
//			//display all available colors to the user
		    //Scanner sc=new Scanner(System.in);
			System.out.println("Available colors : ");
			//System.out.println(Color.values());
			System.out.println(Color.SILVER.name());
			System.out.println(Color.SILVER.ordinal());
			for(Color c : Color.values())
				System.out.print(c+" ");
			//prompt user to choose one n parse it 
			System.out.println("\nChoose a color");
			Color chosenColor=Color.valueOf(sc.next().toUpperCase());
			System.out.println("You chose "+chosenColor);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("code continues....");

	}

}
