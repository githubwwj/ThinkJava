package strings;

public class MyArrayList {

	Object[] elementData;

	/**
	 * The size of the ArrayList (the number of elements it contains).
	 *
	 * @serial
	 */
	private int size;

	public MyArrayList() {
		elementData = new Object[10];
	}

	MyArrayList(int initialCapacity) {
		if (initialCapacity < 0)
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		elementData = new Object[initialCapacity];
	}

	public boolean add(Object obj) {
		ensureCapacityInternal(size + 1); // Increments modCount!!
		elementData[size++] = obj;
		return true;
	}

	public Object get(int index) {
		rangeCheck(index);
		return elementData[index];
	}

	public Object set(int index, Object element) {
		rangeCheck(index);

		Object oldValue = elementData[index];
		elementData[index] = element;
		return oldValue;
	}

	private void rangeCheck(int index) {
		if (index >= size)
			throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
		if (index < 0) {
			throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
		}
	}

	private String outOfBoundsMsg(int index) {
		return "Index: " + index + ", Size: " + size;
	}

	private void ensureCapacityInternal(int minCapacity) {
		if (minCapacity - elementData.length > 0)
			grow(minCapacity);
	}

	private void grow(int minCapacity) {
		// overflow-conscious code
		int oldCapacity = elementData.length;
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		if (newCapacity - minCapacity < 0)
			newCapacity = minCapacity;
//		elementData = Arrays.copyOf(elementData, newCapacity);
		Object[] objs = new Object[newCapacity];
		for (int i = 0; i < size; i++) {
			objs[i] = elementData[i];
		}
		elementData = objs;
	}

	public Object remove(int index) {
		rangeCheck(index);

		Object oldValue = elementData[index];

		int numMoved = size - index - 1;
		if (numMoved > 0)
			System.arraycopy(elementData, index + 1, elementData, index, numMoved);
		elementData[--size] = null; // clear to let GC do its work

		return oldValue;
	}

	public boolean remove(Object o) {
		if (o == null) {
			for (int index = 0; index < size; index++)
				if (elementData[index] == null) {
					fastRemove(index);
					return true;
				}
		} else {
			for (int index = 0; index < size; index++)
				if (o.equals(elementData[index])) {
					fastRemove(index);
					return true;
				}
		}
		return false;
	}

	/*
	 * Private remove method that skips bounds checking and does not return the
	 * value removed.
	 */
	private void fastRemove(int index) {
		int numMoved = size - index - 1;
		if (numMoved > 0)
			System.arraycopy(elementData, index + 1, elementData, index, numMoved);
		elementData[--size] = null; // clear to let GC do its work
	}

	public int size() {
		return size;
	}

	/**
	 * Returns <tt>true</tt> if this list contains no elements.
	 *
	 * @return <tt>true</tt> if this list contains no elements
	 */
	public boolean isEmpty() {
		return size == 0;
	}

}
