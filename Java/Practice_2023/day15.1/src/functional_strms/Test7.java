package functional_strms;

import static utils.ShopUtils.*;

import java.util.Map;
import java.util.stream.Stream;

import com.shop.core.Category;
import com.shop.core.Product;

public class Test7 {

	public static void main(String[] args) {
		
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		System.out.println("products in the shop");
		productMap.forEach((k, v) -> System.out.println(v));
		Category cat = Category.OIL;
		// Display name of cheapest product ,from the specified category
		// map --> Collection --> stream --> filter --> min --> Optional<T> :
		// orElseThrow()
		Product product = productMap.values() // Collection<Product>
				.stream() // Stream<Product>
				.filter(p -> p.getProductCategory() == cat) // Stream<Product> : filtered as per cat
				.min((p1,p2) -> ((Double)p1.getPrice()).compareTo(p2.getPrice()))//Optional<Product>
				.orElseThrow();//in case of empty Optional : NosuchelemExc
		System.out.println("Name of least expensive product "+product.getName());
		Stream<Product> productStrm=productMap.values().stream();
		long cnt=productStrm.count();
		productStrm.forEach(System.out::println);  //java.lang.IllegalStateException: stream has already been operated upon or closed
			
	}

}
