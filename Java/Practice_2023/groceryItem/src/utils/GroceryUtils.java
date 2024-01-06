package utils;

import java.util.List;

import com.app.core.Grocery;

import custom_exception.GroceryExceptionHandling;

public class GroceryUtils {
	public static Grocery findItemByName(String name, List<Grocery> gList) throws GroceryExceptionHandling {
		Grocery g1 =  new Grocery(name);
		int index = gList.indexOf(g1);
		if(index==-1)
			throw new GroceryExceptionHandling("Invalid name");
		
		return gList.get(index);
	}
}
