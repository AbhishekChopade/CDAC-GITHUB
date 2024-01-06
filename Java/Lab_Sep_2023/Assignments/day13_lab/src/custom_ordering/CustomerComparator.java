package custom_ordering;

import java.util.Comparator;

import com.app.core.Customer;

public class CustomerComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		System.out.println("in compare");
		int val = o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
		if(val==0) {
			return o2.getLastName().compareTo(o2.getLastName());
		}

		return val;
		
	}

	
	

}
