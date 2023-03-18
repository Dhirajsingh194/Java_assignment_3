package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {
		//33,44,55,66,77,88 
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(33);
		l1.add(44);
		l1.add(55);
		l1.add(66);
		l1.add(77);
		l1.add(88);
		System.out.println("Original List:"+l1);
		
		//Remove second element from list using index
		l1.remove(1);
		System.out.println("After Removing 2nd Element:"+l1);
		
		//Remove second element from list using value
		int elementToRemove = 55;
		int indexToRemove = l1.indexOf(elementToRemove);

		if (indexToRemove > 0 && indexToRemove < l1.size()) {
		   l1.remove(indexToRemove);
		}
		System.out.println("After Removing second element from list using value"+l1);
		
		//Add 90 at index 3
		l1.add(2, 90);
		System.out.println("Add 90 at index 3"+l1);
		
		//Get the length of list
		System.out.println("Length of list:"+l1.size());
		
		for (int value : l1) {
		    System.out.println("Print all values from list using any values:"+value);
		}
		
		//Convert list into array
		int[] arr = l1.stream().mapToInt(i -> i).toArray();
		System.out.println("List into array"+l1);
	}

}
