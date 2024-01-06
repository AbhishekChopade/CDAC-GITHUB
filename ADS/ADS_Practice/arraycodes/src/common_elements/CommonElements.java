package common_elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonElements {

	public static void main(String[] args) {
		int[] arr1 = {1,3,4,6,7,9};
		int[] arr2 = {1,2,4,5,9,10};
		int[] arr3 = commonElements(arr1, arr2);
		System.out.println(Arrays.toString(arr3));
	}
	
	
	public static int[] commonElements(int[] arr1,int[] arr2) {
		List<Integer> list = new ArrayList<>();
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr1.length;i++) {
			map.put(arr1[i], 1);
			
		}
		for(int i=0;i<arr1.length;i++) {
			if(map.containsKey(arr2[i])) {
				list.add(arr2[i]);
			}
		}
		int[] arr3 = list.stream().mapToInt(i->i).toArray();
		return arr3;
	}
}

