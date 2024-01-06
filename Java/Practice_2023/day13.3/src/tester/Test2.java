package tester;

import com.app.fruit.*;

import static utils.GenericUtils.displayTaste;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Melon> melons=new ArrayList<>();
		melons.add(new Melon("ab"));
		melons.add(new Melon("cd"));
		melons.add(new Melon("ef"));
		System.out.println("taste =");
		displayTaste(melons);
		//Vector<SalesMgr> : Try it (Lab work)
		
		
		
	}

}
