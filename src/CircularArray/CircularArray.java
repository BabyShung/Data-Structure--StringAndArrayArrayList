package CircularArray;

import java.util.Iterator;

public class CircularArray<T> implements Iterable<T> {

	private T[] items;
	private int head = 0;

	public CircularArray(int size) {
		items = (T[]) new Object[size];
	}

	private int convert(int index) {
		if (index < 0)
			index += items.length;
		return (head + index) % items.length;
	}

	public void rotate(int shiftRight) {
		head = convert(shiftRight);
	}

	public T get(int i) {
		if (i < 0 || i >= items.length)
			throw new java.lang.IndexOutOfBoundsException("index out of bound!");
		return items[convert(i)];
	}

	public void set(int i, T item) {
		items[convert(i)] = item;
	}

	@Override
	public Iterator<T> iterator() {
		return new CircularArrayIterator(this);
	}

	private class CircularArrayIterator implements Iterator<T> {

		private int current;
		private T[] items;

		public CircularArrayIterator(CircularArray<T> a) {
			items = a.items;
		}

		@Override
		public boolean hasNext() {
			return current < items.length;
		}

		@Override
		public T next() {

			T item = (T) items[convert(current)];
			current++;
			return item;
		}

		@Override
		public void remove() {
			throw new Error("method disabled");
		}

	}

}
