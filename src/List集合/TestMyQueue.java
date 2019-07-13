package List集合;
/**
 * 1、请使用LinkedList来模拟一个队列(先进先出的特性): 
 * 1.1 拥有放入对象的方法void put(Object o)
 * 1.2 取出对象的方法Object get()
 * 1.3 判断队列当中是否为空的方法boolean isEmpty()；
 * 并且，编写测试代码，验证你的队列是否正确。
 * <p>Title: TestMyQueue</p>  
 * <p>Description: </p>  
 * @author xianxian 
 * @date 2019年7月13日
 */
public class TestMyQueue {

	public static void main(String[] args) {

		MyQueue q = new MyQueue();//创建了一个队列
		q.put("123");
		q.put("567");
		q.put("663");
		q.put("77");
		q.put("10");
		q.put("23");
		
		System.out.println(q.toString());
		
		/*
		 * 123  567 663  77  10  23
		 * 
		 * 
		 */
		System.out.println("============================");
		while(!q.isEmpty())
		{
			System.out.println(q.get());
		}
		
		System.out.println(q.isEmpty());
		
	}

}
