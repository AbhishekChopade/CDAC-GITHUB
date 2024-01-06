package utils;

import java.util.Map;

import com.app.pets.Category;
import com.app.pets.Status;

import author.User;
import custom_exception.AuthenticationException;
import custom_exception.AuthorizationException;

public class PetOrderValidationRules {
	public static boolean isAdmin(String loginid, String password, Map<String,User> userMap) throws AuthenticationException {
	
		if (userMap.containsKey(loginid)) {
			if(password.equals("admin")) {
				return true;
			}else {
				throw new AuthenticationException("Invalid password");
			}
		}else
			throw new AuthenticationException("Invalid loginId");
	}
	
	public static boolean isCustomer(String loginid, String password, Map<String,User> userMap) throws AuthenticationException {
		
		if (userMap.containsKey(loginid)) {
			if(userMap.get(loginid).getPassword().equals(password)) {
				return true;
			}else {
				throw new AuthenticationException("Invalid password");
			}
		}else
			throw new AuthenticationException("Invalid loginId");
	}
	
	
	public static void isAdminLoggedIn(boolean isAdmin) throws AuthorizationException {
		if(!isAdmin)
			throw new AuthorizationException("Admin is Not logged in");
		
	}
	public static void isLoggedIn(boolean isCustomer,boolean isAdmin) throws AuthorizationException {
		if(!isAdmin) {
			if(!isCustomer)
				throw new AuthorizationException("No-one is Not logged in");
		}
		
	}
	
	public static Category parseAndValidateCategory(String category) {
		return Category.valueOf(category.toUpperCase());
	}
	
	public static Status parseAndValidateStatus(String status) {
		return Status.valueOf(status.toUpperCase());
	}
}
