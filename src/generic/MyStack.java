package generic;

/**
 * 通过栈小列子熟悉泛型
 */
public class MyStack<E> {

	private static class Node<E> {
		E item; // 盘子中放的数据
		Node<E> next; // 后面的盘子

		Node(E element, Node<E> next) {
			this.item = element;
			this.next = next;
		}
	}

	private Node<E> first = null;
	private int size = 0;

	public void push(E e) {
		final Node<E> node = new Node<E>(e, first);
		first = node;
		size++;
	}

	public E pop() {
		final Node<E> f = first;
		E element = null;
		if (null != f) {
			element = f.item;
			first = first.next;
			f.next = null;
			f.item = null;
			size--;
		}
		return element;
	}

	public static void main(String[] args) {
		MyStack<String> myStack = new MyStack<String>();
		for (String str : "I like dog very much !".split(" ")) {
			myStack.push(str);
		}
		String str = null;
		while ((str = myStack.pop()) != null) {
			System.out.println(str);
		}

	}

}
