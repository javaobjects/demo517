package List集合;

import java.util.ArrayList;
import java.util.List;

public class TestCollection1 {

	public static void main(String[] args) {
		List list = new ArrayList(10);
		list.add("abc");
		list.add(10);
		
		list.add(new Object());
		list.add("abc");
		list.add(10);
		
		list.add(new Object());
		list.add("abc");
		list.add(10);
		
		list.add(new Object());
		list.add("abc");
		list.add(10);
		
		System.out.println(list);
	}
	
}
