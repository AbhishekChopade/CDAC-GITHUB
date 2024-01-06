package tester;
import com.app.fruits.*;
import java.util.Scanner;
public class FruitBasket {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of fruit basket :");
		Fruit[] fruits = new Fruit[sc.nextInt()];
		boolean exit = false;
		int cnt = 0;
		
		while(!exit) {
			
			System.out.println("1. Add Mango\n"+"2. Add Orange\n"+"3. Add Apple\n"+"4. Display names of all fruits in the basket.\n"+
                               "5. Display name,color,weight , taste of all fresh fruits , in the basket.\n"+
				 			   "6. Mark a fruit in a basket , as stale(=not fresh)\n"+"7. Mark all sour fruits stale\n"+
                               "8. Invoke fruit specific functionality (pulp / juice / jam)\n"+"9. Exit\n");
			System.out.println("Choose");
			switch(sc.nextInt())
			{
			case 1://Add Mango
				if(cnt<fruits.length)
				{
					System.out.println("Enter the color, weight, & true if Mango is fresh or false for stale ");
					fruits[cnt++]= new Mango(sc.next(),sc.nextDouble(),sc.nextBoolean());
					System.out.println("Mango is added in the basket");
					
				}
				else
					System.out.println("Basket is full!!");
				break;
				
			case 2://Add Orange
				if(cnt<fruits.length)
				{
					System.out.println("Enter the color, weight, & true if Orange is fresh or false for stale ");
					fruits[cnt++]= new Orange(sc.next(),sc.nextDouble(),sc.nextBoolean());
					System.out.println("Orange is added in the basket");
					
				}
				else
					System.out.println("Basket is full!!");
				break;
				
			case 3://Add Apple
				if(cnt<fruits.length)
				{
					System.out.println("Enter the color, weight, & true if Apple is fresh or false for stale ");
					fruits[cnt++]= new Apple(sc.next(),sc.nextDouble(),sc.nextBoolean());
					System.out.println("Apple is added in the basket");
					
				}
				else
					System.out.println("Basket is full!!");
				break;
				
			case 4://Display names of all fruits in the basket.
				System.out.println("Names of all fruits in the basket");
				for(Fruit f:fruits) {
					if(f!=null)
						System.out.println(f.getName());
				}
				break;
				
			case 5://Display name,color,weight , taste of all fresh fruits , in the basket.
				System.out.println("Name, color, weight & taste of all fresh fruits");
				for(Fruit f:fruits) {
					if(f!=null && f.getFresh()==true)
						System.out.println(f+" "+f.taste()+" in taste");
				}
				break;
				
			case 6:// Mark a fruit in a basket , as stale(=not fresh)
				System.out.println("Enter the index :");
				int ind = sc.nextInt() - 1;
				if(ind>=0 && ind<cnt)
				{
					fruits[ind].setFruitStale();
					System.out.println("Fruit is marked as stale");
				}
				else
					System.out.println("Invalid Index");
				
				break;
			case 7://Mark all sour fruits stale
				for(Fruit f:fruits) {
					if(f!=null && f.taste()=="sour")
						f.setFruitStale();
				}
				System.out.println("All sour fruits marked as stale");
				break;
			case 8://Invoke fruit specific functionality (pulp / juice / jam)
				System.out.println("Enter the index :");
				ind = sc.nextInt() - 1;
				if(ind>=0 && ind<cnt)
				{
					Fruit f1 = fruits[ind];
					if(f1 instanceof Mango)
						((Mango) f1).pulp();
					else if(f1 instanceof Orange)
						((Orange)f1).juice();
					else
						((Apple)f1).jam();
						
				}
				else
					System.out.println("Invalid Index");
				break;
			case 9://exit
				exit =true;
				System.out.println("Exit!!!!");
				break;
			
			}
				
		}
		sc.close();
	}

}
