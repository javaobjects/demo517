package Map集合;

public class Test<E> {//如果此类被实例化 E 被赋值为String 那么所有的E都是String

	private Object[] objs = new Object[2000];
	
	private E element;
	
	public E getElement() {
		return element;
	}
	
	public void put(E e) {
		objs[0] = e;
	}

}
