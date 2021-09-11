package com.example.lab2;

import java.util.Comparator;

class FruitComparator implements Comparator<Fruit> {
	
	@Override
	public int compare(Fruit s1, Fruit s2) {
		return s1.name.compareTo(s2.name);
	}
}

class FruitComparatorDesc implements Comparator<Fruit> {
	
	@Override
	public int compare(Fruit s1, Fruit s2) {
		return s2.name.compareTo(s1.name);
	}
}