package com.aoeng.af1325;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item> {

	private Item[] a = (Item[]) new Object[1];
	private int N = 0;

	public boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}

	/**
	 * 将栈 移动到大小为 max 的数组中
	 * 
	 * @param max
	 */
	private void reSize(int max) {
		Item[] temp = (Item[]) new Object[max];
		for (int i = 0; i < N; i++) {
			temp[i] = a[i];
		}
		a = temp;
	}

	/**
	 * 将元素添加到栈顶
	 * 
	 * @param item
	 */
	public void push(Item item) {
		if (N == a.length) {
			reSize(2 * a.length);
		}
		a[N++] = item;
	}

	/**
	 * 从栈顶删除元素
	 * 
	 * @return
	 */
	public Item pop() {
		Item item = a[--N];
		a[N] = null;
		if (N > 0 && N == a.length / 4) {
			reSize(a.length / 2);
		}
		return item;
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ReverseArrayIterator();
	}

	private class ReverseArrayIterator implements Iterator<Item> {
		// 支持后进先出的迭代
		private int i = N;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i > 0;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			return a[--i];
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}

	}
}
