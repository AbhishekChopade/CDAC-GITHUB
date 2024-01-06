package threads;

import java.io.FileOutputStream;

import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import static utils.IOUtils.storeProductDetails;
import com.shop.core.Product;

public class SortAsPerDate implements Runnable{
	private Map<Integer,Product> productMap;
	public SortAsPerDate(Map<Integer,Product> productMap) {
		super();
		this.productMap = productMap;
	}
	@Override
	public void run() {
		try(Scanner sc = new Scanner(System.in)) {
//		List<Product> productList = new ArrayList<>(productMap.values());	
//		Map<Integer,Product> productMap2 = productList.stream().
//		sorted((p1,p2)->p1.getManufactureDate().compareTo(p2.getManufactureDate())).collect(Collectors.toMap(p->p.getProductId(), p->p));
//		System.out.println(productMap2);
		List<Product> productList = new ArrayList<>(productMap.values());
		Collections.sort(productList,(p1,p2)->(p1.getManufactureDate().compareTo(p2.getManufactureDate())));
		//Thread.sleep(50);
		System.out.println("Map is sorted");
		productList.forEach(p->System.out.println(p));
		System.out.println("Enter the file name");
		
		storeProductDetails(productList,sc.next());
		System.out.println("Map is added into binary file");
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
