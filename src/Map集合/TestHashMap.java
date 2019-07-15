package Map集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {

		/**
		 * Map 集合的特点： 
		 * 1. key不能重复，null类型也不能重复
		 * （因为这个key在 内存里面是乱放的，
		 * 如何键相同则认为是同一个对象，
		 * 所以地址是同一个地址）
		 * 2. key可以是 null
		 * 3. value列的值有多个null是可以的
		 * 
		 */
		Map<Integer,String> m;
		m = new HashMap<>();
		
		m.put(1,"yezong");
		m.put(2,"zhaozong");
		m.put(3,"chenzong");
		
		m.put(null,null);
		m.put(null,null);
		m.put(4,"yezong");
		m.put(3,"tanzong");
		
		for(Integer i: m.keySet()) {
			System.out.println(i);
		}
		
		Set<Entry<Integer,String>> s = m.entrySet();
		Iterator<Entry<Integer,String>> it = s.iterator();
		while(it.hasNext()) {
			Entry<Integer, String> e = it.next();
			System.out.println("e.getKey(): " + e.getKey() + "     e.getValue():" + e.getValue());
		}
	}

}
