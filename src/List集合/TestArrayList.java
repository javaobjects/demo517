package List集合;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合的CRUD
* <p>Title: TestArrayList</p>  
* <p>Description: </p>  
* @author xianxian 
* @date 2019年7月12日
 */
public class TestArrayList {

	/**
	 * 1. 声明集合时需要把泛型具体化，否则黄色警告
	 * 2.list集合是三有产品：有序(索引)，有重复，有null值
	 * <p>Title: main</p>  
	 * <p>Description: </p>  
	 * @param args
	 */
	public static void main(String[] args) {
		//1.ArrayList的创建
//		List list = new ArrayList(); 
//		
//		list.add("abc");
//		
//		list.add(123);
		
//		for (int i = 0; i < list.size(); i++) {
//			int num = Integer.valueOf((String)list.get(i));
//			System.out.println(num);
//		}//这个代码有隐患，会抛出异常，解决方法是声明的时候：List<String>
		
		List<Integer> list = new ArrayList<Integer>();//前面声明咯类型后面也要这样写，然后构造方法一组圆括号
		list.add(123);
		list.add(null);
		list.add(234);
		list.add(123);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("list.contains(123): " + list.contains(123));
		
		//修改方法
		list.set(0,666);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(0);//这是真正的删除方法，会把这个元素从集合中拿走，然后后面的元素都往前挪
		
		System.out.println("================");
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
//		list.clear();
//		System.out.println(list.size());
		
		List subList = list.subList(1,3);
		System.out.println("====================");
		for (int i = 0; i < subList.size(); i++) {
			System.out.println(subList.get(i));
		}
	}

}
