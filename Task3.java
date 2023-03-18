package assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(100);
		l1.add(100);
		l1.add(100);
		l1.add(100);
		l1.add(100);
		l1.add(100);
		l1.add(100);
		l1.add(100);
		System.out.println("Original List:"+l1);

		for (int i=0;i<l1.size();i++)
		{
			sum=sum+l1.get(i);			
		}
			 
		System.out.println("Total: "+sum);
		
	}
}