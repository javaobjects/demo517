package List集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayListBug {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("777c");
		list.add("123");
		list.add("456");
		list.add("456");
		list.add("456");//4  3
		list.add("aqqc");
		list.add(null);
		list.add(null);// 7  6
		
		//需求：把元素456删除
		//用下面的代码如果两个456挨着，那么后面那个不会被删除
//		for (int i = 0; i < list.size(); i++) {//0 ----- 7 list.get(7)
//			if("456".equals(list.get(i))) {
//				list.remove(i);
//			}
//			System.out.println(list.get(i));
//		}
		//解决方案：从后面往前删除就可以了
//		for (int i = list.size()-1; i >=0; i--) {
//			System.out.println(list.get(i));
//			if("456".equals(list.get(i)))
//			{
//				list.remove(i);
//			}
//		}
//		
//		System.out.println("==================");
//		System.out.println(list.toString());
		
		//我自己的理解，更好的删除方法，不会漏掉任何元素
		for (int i = 0; i < list.size(); i++) {
			if("456".equals(list.get(i))) {
				list.remove(i);
				i--;
			}
		}
		System.out.println(Arrays.toString(list.toArray()));
	}

}
