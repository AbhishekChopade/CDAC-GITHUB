package tester;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import static java.time.LocalDate.parse;
import static utils.GroceryUtils.findItemByName;

import com.app.core.Grocery;

public class TestGrocery {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			List<Grocery> groceryList =  new ArrayList<>();
			boolean exit = false;
			while(!exit) {
				System.out.println("Enter Options : \n"+"1. Add a new grocery item\n"+"2. Update the quantity of grocery item in stock\n"+
									"3. Display the list of all items\n"+"4. Remove all empty stock items\n"+
										"5 . Display all products for which stock updated in last three days\n"+"6. Exit");
				try {
					switch(sc.nextInt()) {
					case 1://Add a new grocery item
						System.out.println("Enter the groceryName, pricePerUnit, stockQuantity, listDate");
						Grocery g1= new Grocery(sc.next(), sc.nextDouble(), sc.nextInt(), parse(sc.next()));
						groceryList.add(g1);
						System.out.println("Item is added");
						break;
						
					case 2://Update the quantity of grocery item in stock
						System.out.println("Enter the name and quantity of item");
						g1 = findItemByName(sc.next(),groceryList);
						int quantity = sc.nextInt();
						g1.setStockQuantity(g1.getStockQuantity()+quantity);
						System.out.println(g1);
						System.out.println("Quantity updated");
						break;
						
					case 3://Display the list of all items
						System.out.println("All grocery item details");
						groceryList.forEach(g->System.out.println(g));
						break;
						
					case 4://Remove all empty stock items
						Iterator<Grocery> gryItr = groceryList.iterator();
						while(gryItr.hasNext()) {
							Grocery g = gryItr.next();
							if(g.getStockQuantity()==0) {
								System.out.println(g);
								gryItr.remove();
							}
						}
						System.out.println("Empty Items removed");
						break;
						
					case 5://Display all products for which stock updated in last three days
						System.out.println("All products for which stock updated in last three days");
						for(Grocery g:groceryList) {
							int days = Period.between(g.getUpdateDate(), LocalDate.now()).getDays();
							if(days<3) {
								System.out.println(g);
							}
						}
							
						break;
						
					case 6://Exit
						exit = true;
						System.out.println("Exit!!!!!");
						break;
					}
						
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
				}
			}
			
		}

	}


