package List集合;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestArrayListListIterator {

	public static void main(String[] args) {
		/**
		 * 双向遍历，必须先自前往后遍历过，然后才能自后往前
		 */
		List<String> list = new ArrayList<>();

		list.add("abc");
		list.add("777c");
		list.add("123");
		list.add("456");
		list.add("aaa");
		list.add("aqqc");
		list.add(null);
		
		ListIterator<String> it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.println("it first while: " + it.next());
		}
		
		System.out.println("======================");
		
		while(it.hasPrevious())//因为上面那个循环结束之后，指针在集合的最后，所以这个时候可以自后往前迭代访问集合
		{
			System.out.println("it second while"+it.previous());
		}
	}
}
