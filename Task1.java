package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		l1.add(132);
		l1.add(112);
		l1.add(1232);
		l1.add(100);
		l1.add(200);
		l1.add(102);
		l1.add(1992);
		System.out.println("Original List:"+l1);
		for (int i=0;i<l1.size()-1;i++)
		{
			System.out.println("List of Integer values: "+l1.get(i));
		}
		
		/*for (Integer num:l1)
			System.out.println(num);*/
	}

}
