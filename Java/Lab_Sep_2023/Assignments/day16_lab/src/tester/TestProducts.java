package tester;

import static utils.ShopUtils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.shop.core.*;

import threads.*;

public class TestProducts {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			List<Product> productList = populateProductList();
			Map<Integer,Product> productMap = populateProductMap(productList);

			boolean exit = false;
			while(!exit) {
				System.out.println("Enter Option :\n"+"1. Get a map of products with sample (hard coded) data\n"
						+ "2. Sort the products as per date n save the sorted results (on separate lines) in the text file (u can replace it by bin file using ser. as extra task)\n"
						+ "3. Sort the products as per price n save the sorted results (on separate lines) in the text file (u can replace it by bin file using ser. as extra task)\n"
						+ "4. Ensure no orphans\n"+"5. Display all details\n"+"6. Exit");
			try {
				switch(sc.nextInt()) {
				case 1://
					productMap = populateProductMap(productList);
					System.out.println("Populated map details");
					productMap.forEach((pk,pv)->System.out.println(pv));
					break;
					
				case 2:
					Thread t1 = new Thread(new SortAsPerDate(productMap), "SortAsPerDate");
					t1.start();
					System.out.println("main waiting for child thrds....");
					t1.join();
					break;
					
				case 3:
					Thread t2 = new Thread(new SortAsPerPrice(productMap), "SortAsPerPrice");
					t2.start();
					System.out.println("main waiting for child thrds....");
					t2.join();
					System.out.println("main over...");
					break;
					
				case 4:
					productList = new ArrayList<>(productMap.values());	
					Map<Integer,Product> productMap2 = productList.stream().
					sorted((p1,p2)->p1.getManufactureDate().compareTo(p2.getManufactureDate())).collect(Collectors.toMap(p->p.getProductId(), p->p));
					productMap2.forEach((pk,pv)->System.out.println(pv));
					break;
				case 5:
					break;
					
				case 6://exit
					exit = true;
					System.out.println("Exit!!!");
					break;
					
				}
			}catch (Exception e) {
				e.printStackTrace();
				sc.nextLine();
			}
		  }
		}

	


	}

}
