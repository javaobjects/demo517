package List集合;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {

		/**
		 * Vector是同步的，性能较差。
		 * Vector类中的方法都是synchronized的
		 * 如果一个不需要线程安全的实现
		 * 建议在使用Vector的地方使用ArrayList
		 */
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("777c");
		list.add("123");
		list.add("456");
		list.add("456");
		list.add("aqqc");
		list.add(null);
		list.add(null);
		
		Vector<String> v = new Vector<>(list);
		
		System.out.println(v.toString());
		
	}

}
