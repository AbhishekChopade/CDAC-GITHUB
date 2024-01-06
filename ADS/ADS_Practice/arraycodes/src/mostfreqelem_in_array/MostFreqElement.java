package mostfreqelem_in_array;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MostFreqElement {

	public static void main(String[] args) {
		int[] arr1 = {1,3,1,3,2,15,10,23,15,20,15,15,1,1,1};
		
		

		
		int key = mostFrequentElement(arr1);
		System.out.println("Most frequent element in array is "+key);
		
		

	}
	
	public static int mostFrequentElement(int[] arr1) {
        int cnt = 0;
		Map<Integer,Integer> arrMap = new HashMap<>();
		int max = 0;
		int key=0;
		
		for(int i=0;i<arr1.length;i++) {
			if(arrMap.containsKey(arr1[i])) {
				arrMap.put(arr1[i],arrMap.get(arr1[i])+1 );
				if(arrMap.get(arr1[i])>max) {
					max = arrMap.get(arr1[i]);
				}
				
			}
			
			else
				arrMap.put(arr1[i], 1);
				
		}
		System.out.println(max);
		for(Map.Entry<Integer,Integer> map:arrMap.entrySet()) {
			if(map.getValue()==max)
				return map.getKey();
		}

		return 0;
	}

}
