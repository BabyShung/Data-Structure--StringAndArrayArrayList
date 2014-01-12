package ArrayList;

import Interfaces.ArrayList;

public class ArrayBasedArrayList<T> implements ArrayList<T> {

	private T[] theList;
	private int size;

	public ArrayBasedArrayList() {
		// originally size of 2, then keep on doubling
		theList = (T[]) new Object[2];
	}

	@Override
	public T get(int index) {
		checkIndex(index);
		return theList[index];
	}

	@Override
	public T set(int index, T element) {

		checkIndex(index);
		T oldElement = theList[index];
		theList[index] = element;
		return oldElement;
	}

	// another popular method in Java
	public void add(T element) {
		add(size(), element);
	}

	@Override
	public void add(int index, T element) {

		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException("Cannot access index " + index
					+ " in array of size " + size());
		}

		if (theList.length <= size()) {
			T[] newList = (T[]) new Object[theList.length * 2];
			System.arraycopy(theList, 0, newList, 0, theList.length);
			theList = newList;
		}
		// move the rest
		System.arraycopy(theList, index, theList, index + 1, size() - index);
		theList[index] = element;
		size++;
	}

	@Override
	public T remove(int index) {
		checkIndex(index);
		T oldElement = theList[index];
		// move the rest
		System.arraycopy(theList, index + 1, theList, index, size() - index - 1);
		size--;
		return oldElement;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size() <= 0);
	}

	// check if index is valid
	private void checkIndex(int index) {
		if (index >= size() || index < 0) {
			throw new IndexOutOfBoundsException("Tried to access element "
					+ index + " in an array of size " + size());
		}
	}
}
