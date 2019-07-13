package List集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestArrayListIterator {

	public static void main(String[] args) {

		/**
		 * 对ArrayList的迭代访问方法有哪些？
		 * 1. for循环
		 * 2. Iterator迭代器
		 * 3. 直接调用java底层API中的方法访问（两种）
		 */
		
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("777c");
		list.add("123");
		list.add("456");
		list.add("aaa");
		list.add("aqqc");
		list.add(null);
		list.add(null);
		
		//1.for循环
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list for:" + list.get(i));
		}
		//2.Iterator迭代器
		//此处的数据类型与之前的List数据类型需要保持一致
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {//index = 0 < list.size() index++
			System.out.println("list iterator: " + it.next());
		}
		//3. 利用底层API：toArray()
		System.out.println(Arrays.toString(list.toArray()));
		System.out.println("===========");
		//4. 利用底层API: toString()
		System.out.println(list.toString());
	}
}
