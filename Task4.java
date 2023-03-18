package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number= {12,13,14,15,16,17,18,19};
		List<Integer> l1=new ArrayList<Integer>();
		
		for (int i=0;i<number.length;i++)
		{
			l1.add(number[i]);
			
		}
		System.out.println(l1);
	}

}
