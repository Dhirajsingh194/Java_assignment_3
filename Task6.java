package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Task6 {

	public static void main(String[] args) {

		List<String> l1=new ArrayList<String>();
		l1.add("Web Automation");
		l1.add("API Automation");
		l1.add("Mobile Automation");
		
		System.out.println(l1.contains("Mobile"));
		System.out.println(l1.contains("Mobile Automation"));
		
		
	}

}
