import java.util.Scanner;
public class FoodMenu {

	public static void main(String[] args)
	{
	     Scanner sc = new Scanner(System.in);
	     boolean exit = false;
	     int quan;
	     int price;   // price of single product
	     int totalbill = 0;   //total bill
	    while(!exit){
	        System.out.println("Enter the choice 1.Dosa, 2.Samosa, 3.Idli, 4.Poha, 5.Upma, 6.Vada, 7.Misal, 8.Coffee, 9.Tea, 10.Generate Bill");
			switch(sc.nextInt())
			{
				case 1://Dosa
					System.out.println("Your choice is Dosa");
					System.out.println("Enter the quantity = ");
					quan = sc.nextInt();
					price = 40;
					totalbill += price*quan;
					break;

				case 2://Samosa
					System.out.println("Your choice is Samosa");
					System.out.println("Enter the quantity = ");
					quan = sc.nextInt();
					price = 15;
					totalbill += price*quan;
					break;

				case 3://Idli
					System.out.println("Your choice is Idli");
					System.out.println("Enter the quantity = ");
					quan = sc.nextInt();
					price = 30;
					totalbill += price*quan;
					break;

				case 4://Poha
					System.out.println("Your choice is Poha");
					System.out.println("Enter the quantity = ");
					quan = sc.nextInt();
					price = 20;
					totalbill += price*quan;
					break;

				case 5://Upma
					System.out.println("Your choice is Upma");
					System.out.println("Enter the quantity = ");
					quan = sc.nextInt();
					price = 20;
					totalbill += price*quan;
					break;

				case 6://Vada
					System.out.println("Your choice is Vada");
					System.out.println("Enter the quantity = ");
					quan = sc.nextInt();
					price = 15;
					totalbill += price*quan;
					break;

				case 7://Misal
					System.out.println("Your choice is Misal");
					System.out.println("Enter the quantity = ");
					quan = sc.nextInt();
					price = 40;
					totalbill += price*quan;
					break;

				case 8://Coffee
					System.out.println("Your choice is Coffee");
					System.out.println("Enter the quantity = ");
					quan = sc.nextInt();
					price = 15;
					totalbill += price*quan;
					break;

				case 9://Tea
					System.out.println("Your choice is Tea");
					System.out.println("Enter the quantity = ");
					quan = sc.nextInt();
					price = 10;
					totalbill += price*quan;
		       		break;
				case 10:
					System.out.println("Total Bill = "+totalbill);
					exit = true;
					break;




		
		}//end of switch
	  }//end of while

		sc.close();
	}//end of main

}
