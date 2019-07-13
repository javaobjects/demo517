package List集合;

import java.util.LinkedList;

/**
 * 1、请使用LinkedList来模拟一个队列(先进先出的特性): 
 * 1.1 拥有放入对象的方法void put(Object o)
 * 1.2 取出对象的方法Object get()
 * 1.3 判断队列当中是否为空的方法boolean isEmpty()；
 * 并且，编写测试代码，验证你的队列是否正确。
 * <p>Title: MyQueue</p>  
 * <p>Description: </p>  
 * @author xianxian 
 * @date 2019年7月13日
 */
public class MyQueue {
	private LinkedList<String> list = new LinkedList<>();

	//放的方法
	public void put(String str) {
		list.addLast(str);
	}
	
	//取的方法,取的同时把这个元素删除
	public String get() {
		return list.pollFirst();//pollFirst()查询并删除第一个元素 
	}
	
	public boolean isEmpty() {
		return list.size() == 0;
	}

	@Override
	public String toString() {
		return "MyQueue [list=" + list.toString() + "]";
	}
	
}
