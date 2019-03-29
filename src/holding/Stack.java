package holding;

import java.util.LinkedList;

/**
 * 后进先出
 * 放盘子,最后一个放上去,第一个拿出来
 * @param <T>
 */
public class Stack<T> {
	
	LinkedList<T> 	linkedList=new LinkedList<T>();
	
	public void push(T t) {
		linkedList.addFirst(t);
	}
	
	public T pop() {
		return linkedList.removeFirst();
	}

	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
	
	/**
	 * 获取栈的顶部元素,不删除
	 * @return
	 */
	public T get() {
		return linkedList.getFirst();
	}
	
}
