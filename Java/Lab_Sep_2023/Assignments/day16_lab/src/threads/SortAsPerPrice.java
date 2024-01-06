package threads;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.shop.core.Product;

public class SortAsPerPrice implements Runnable{
	private Map<Integer,Product> productMap;
	public SortAsPerPrice(Map<Integer,Product> productMap) {
		super();
		this.productMap = productMap;
	}
	@Override
	public void run() {
		try {
//		Map<Integer,Product> productMap2 = productMap.values().stream().
//		sorted((p1,p2)->p1.getManufactureDate().compareTo(p2.getManufactureDate())).collect(Collectors.toMap(p->p.getProductId(), p->p));
		List<Product> productList = new ArrayList<>(productMap.values());
		Collections.sort(productList,(p1,p2)->((Double)p1.getPrice()).compareTo(p2.getPrice()));
		Thread.sleep(50);
		System.out.println("Map is sorted");
		System.out.println("Enter the file name");
		try(Scanner sc = new Scanner(System.in); 
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(sc.next()))){
			output.writeObject(productList);
			System.out.println("Map is added into binary file");
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
