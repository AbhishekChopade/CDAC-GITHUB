package tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.pets.Category;
import com.app.pets.Order;
import com.app.pets.Pet;
import com.app.pets.Status;

import static utils.PetOrderUtils.*;
import static utils.PetOrderValidationRules.*;

import author.User;
import custom_exception.AuthenticationException;
import custom_exception.AuthorizationException;
import custom_exception.OutOfStockException;

public class PetManagement {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
//			Map<Integer,Pet> petMap = new HashMap<>();
//			Map<Integer,Order> orderMap = new HashMap<>();
			Map<String,User> userMap = populateUser();
			Map<Integer,Pet> petMap = populatePets();
			Map<Integer,Order> orderMap = populateOrder();
	
			boolean isAdmin = false;
			boolean isCustomer = false;
			boolean exit = false;
			while(!exit) {
				System.out.println("Enter Options :\n"+"1. Login\n"+"2. Add new Pet\n"+"3. Update Pet details \n"
						+ "4. Display all available pets\n"+ "5. Order a Pet\n"
						+ "6. Check order status by Order Id\n"+"7. Update order status\n"+ "8. Exit\n");
				try {
					switch(sc.nextInt()) {
					case 1://
						System.out.println("Enter login and password : ");
						String loginId = sc.next();
						String password = sc.next();
						isAdmin = isAdmin(loginId,password, userMap);
						if(isAdmin) {
							
							System.out.println("Admin logged in");
						}
						else {
							isCustomer = isCustomer(loginId,password,userMap);
							System.out.println("Customer logged in");
						}
						
						break;
						
					case 2://Add new Pet (Admin only functionality)
						isAdminLoggedIn(isAdmin);
						
						System.out.println("Enter petId, petName, category, unitPrice, stocks");
						Pet p1 = new Pet(sc.nextInt(), sc.next(), parseAndValidateCategory(sc.next()), sc.nextDouble(), sc.nextInt());
						petMap.put(p1.getPetId(), p1);
						System.out.println("Pets are added");
						break;
						
					case 3://Update Pet details (Admin only functionality)
						isAdminLoggedIn(isAdmin);
						
						System.out.println("Enter petId,stocks");
						p1 = findPetById(sc.nextInt(),petMap);
						p1.setStocks(p1.getStocks()+sc.nextInt());
						System.out.println("Pet details updated successfully");
						
						break;
						
					case 4://Display all available pets
						isLoggedIn(isCustomer, isAdmin);
						System.out.println("all available pets");
						petMap.forEach((pk,pv)->System.out.println(pv));
						break;
						
					case 5://Order a Pet
						isLoggedIn(isCustomer, isAdmin);
						System.out.println("Enter the petId, quantity");
						int petId = sc.nextInt();
						int quantity = sc.nextInt();
						p1 = findPetById(petId,petMap);
						if(p1.getStocks()<quantity)
							throw new OutOfStockException("Quantity is more than available stocks");
						else
						    p1.setStocks(p1.getStocks()-quantity);
						Order o1 = new Order(petId,quantity);
						System.out.println(o1);
						orderMap.put(o1.getOrderId(), o1);
						System.out.println("Order is placed");
						
						break;
						
					case 6://Check order status by Order Id
						isLoggedIn(isCustomer, isAdmin);
						System.out.println("Enter the orderId");
						Order o2 = findOrderById(sc.nextInt(),orderMap);
						System.out.println("Order stauts of "+o2.getOrderId()+" is "+o2.getStatus());
						break;
						
					case 7://Update order status (Admin only functionality)
						isAdminLoggedIn(isAdmin);
						System.out.println("Enter the orderId and status");
						o2 = findOrderById(sc.nextInt(),orderMap);
						Status s1 = parseAndValidateStatus(sc.next());
						o2.setStatus(s1);
						System.out.println("Order id "+o2.getOrderId()+"'s status changed");
						break;
						
					case 8://Exit
						exit = true;
						System.out.println("Exit!!!!");
						break;
					}
				}catch(Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
				
			}
			
			
		}
				

	}

}
