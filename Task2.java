package assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {

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
		
		Iterator<Integer> itr=l1.iterator();
		 
		 while(itr.hasNext())
		 {
			 Integer num=itr.next();
			 
			 System.out.println(num);
		 } 
			 
		
		
	}
}