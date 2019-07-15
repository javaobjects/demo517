package Set集合;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {

		//TreeSet会给元素排序
		
		/**
		 * TreeSet的特点：
		 * 1. 会排序，有大小顺序
		 * 2. 不允许存放null类型数据
		 * 
		 */
		Set<Integer> s = new TreeSet<>();
		
		s.add(100);
		s.add(56);
		s.add(34);
		s.add(8);
		
		System.out.println(s.toString());
		
		Set<String> s2 = new TreeSet<>();
		s2.add("a63c");
		s2.add("a400bc");
		//s2.add(null);
		s2.add("a7c");
		//s2.add(null);
		s2.add("a1c");
		System.out.println(s2.toString());
	}
}
