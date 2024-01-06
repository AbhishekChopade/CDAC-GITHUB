package utils;
import com.app.fruit.*;
import java.util.Collection;
import java.util.List;


import com.app.fruit.Fruit;

public class GenericUtils {
	
	
	public static void displayTaste(List<? extends Fruit> basket) {
		
		for (Fruit f : basket) {
			System.out.println(f.taste());
			
		}
		
	}
}
