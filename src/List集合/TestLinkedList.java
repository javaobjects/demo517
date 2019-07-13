package List集合;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		list.add("abc");
		list.add("777c");
		list.add("123");
		list.add("456");
		list.add("aaa");
		list.add("aqqc");
		list.add(null);
		
		System.out.println("list.getFist(): " + list.getFirst());
		System.out.println("list.getLast(): " + list.getLast());
		System.out.println("=====================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
