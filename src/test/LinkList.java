package test;

import java.util.NoSuchElementException;

public class LinkList<E> {

	private transient int size = 0;

	private transient Node<E> first;

	private transient Node<E> last;

	public void add(E e) {
		linkLast(e);
	}

	public void add(int index, E element) {
		checkElementIndex(index);

		if (index == size)
			linkLast(element);
		else
			linkBefore(element, node(index));
	}

	void linkBefore(E e, Node<E> succ) {
		final Node<E> pred = succ.prev;
		final Node<E> newNode = new Node<>(pred, e, succ);
		succ.prev = newNode;
		if (pred == null)
			first = newNode;
		else
			pred.next = newNode;
		size++;
	}

	private void linkLast(E e) {
		final Node<E> l = last;
		final Node<E> newNode = new Node<E>(last, e, null);
		last = newNode;
		if (first == null) {
			first = newNode;
		} else {
			l.next = newNode;
		}
		size++;
	}

	public E get(int index) {
		checkElementIndex(index);
		return node(index).item;
	}

	private Node<E> node(int index) {
		if (index < (size >> 1)) {
			Node<E> x = first;
			for (int i = 0; i < index; i++)
				x = x.next;
			return x;
		} else {
			Node<E> x = last;
			for (int i = size - 1; i > index; i--)
				x = x.prev;
			return x;
		}
	}

	public E remove() {
		return removeFirst();
	}

	public E removeFirst() {
		final Node<E> f = first;
		if (f == null)
			throw new NoSuchElementException();
		return unlinkFirst(f);
	}

	private E unlinkFirst(Node<E> f) {
		// assert f == first && f != null;
		final E element = f.item;
		final Node<E> next = f.next;
		f.item = null;
		f.next = null; // help GC
		first = next;
		if (next == null)
			last = null;
		else
			next.prev = null;
		size--;
		return element;
	}

	public E remove(int index) {
		checkElementIndex(index);
		Node<E> x = node(index);
		final E element = x.item;
		final Node<E> next = x.next;
		final Node<E> prev = x.prev;

		if (prev == null) {
			first = next;
		} else {
			prev.next = next;
			x.prev = null;
		}

		if (next == null) {
			last = prev;
		} else {
			next.prev = prev;
			x.next = null;
		}
		x.item = null;
		size--;
		return element;
	}

	private void checkElementIndex(int index) {
		if (!isElementIndex(index))
			throw new IndexOutOfBoundsException("索引越界异常:" + index);
	}

	private boolean isElementIndex(int index) {
		return index >= 0 && index < size;
	}

	public int size() {
		return size;
	}

	private static class Node<E> {
		E item;
		Node<E> next;
		Node<E> prev;

		Node(Node<E> prev, E element, Node<E> next) {
			this.item = element;
			this.next = next;
			this.prev = prev;
		}
	}

}
