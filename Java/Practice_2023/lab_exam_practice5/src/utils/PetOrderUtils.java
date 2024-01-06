package utils;

import java.util.HashMap;
import java.util.Map;

import com.app.pets.Category;
import com.app.pets.Order;
import com.app.pets.Pet;

import author.User;

public class PetOrderUtils {
	public static Pet findPetById(int petId,Map<Integer,Pet> petMap) {
		if(petMap.containsKey(petId)) {
			return petMap.get(petId);
		}
		else 
			return null;
	}
	public static Order findOrderById(int orderId,Map<Integer,Order> orderMap) {
		if(orderMap.containsKey(orderId)) {
			return orderMap.get(orderId);
		}
		else 
			return null;
	}
	
	public static Map<Integer,Pet> populatePets(){
		Map<Integer,Pet> petMap = new HashMap<>();
		petMap.put(101, new Pet(101,  "BullDog", Category.DOG, 1000, 50));
		petMap.put(102, new Pet(102,  "Charlie", Category.CAT, 1200, 30));
		petMap.put(103, new Pet(103,  "Peter", Category.RABBIT, 1300, 30));
		petMap.put(104, new Pet(104,  "Tommy", Category.DOG, 2000, 40));
		
		return petMap;
	}
	
	public static Map<Integer,Order> populateOrder(){
		Map<Integer,Order> orderMap = new HashMap<>();
		orderMap.put(11, new Order(101, 50));
		orderMap.put(12, new Order(103, 20));
		orderMap.put(13, new Order(104, 100));
		orderMap.put(14, new Order(102, 20));
		
		return orderMap;
	}
	
	public static Map<String,User> populateUser(){
		Map<String,User> userMap = new HashMap<>();
		userMap.put("admin", new User("admin", "admin"));
		userMap.put("c1", new User("c1", "c1"));
		
		return userMap;
	}

}
