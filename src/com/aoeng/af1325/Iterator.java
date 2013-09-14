package com.aoeng.af1325;

public interface Iterator<Item> {

	boolean hasNext();

	Item next();

	void remove();
}
