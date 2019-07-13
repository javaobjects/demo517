package Set集合;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {

		/**
		 * Set集合的声明及初始化
		 * 
		 * 特点：
		 * 1、无序
		 * 2、无重复
		 * 3、无索引
		 */
		Set<String> s = new HashSet<String>();
		//往集合中添加元素
		s.add("ab3c");
		s.add("a000bc");
		s.add(null);
		s.add("abc");
		s.add(null);
		s.add("abc");
		System.out.println(s.toString());
		System.out.println();
		s.clear();
		
		//set集合的运用：南粤风采36选7
		while(s.size() < 7) {
			int element = new Random().nextInt(36) + 1;//0
			s.add(element + "");
		}
		System.out.println("s.toString(): " + s.toString());
		System.out.println("toArray(): " + Arrays.toString(s.toArray()));
	}

}
