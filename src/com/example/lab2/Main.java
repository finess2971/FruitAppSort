package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Fruit> fr = new ArrayList<Fruit>();
		System.out.println("Fruit List (odered by name)");
		Fruit f1 = new Fruit(1, "Kiwi", 500);
		fr.add(f1);
		Fruit f2 = new Fruit(2, "Apple", 1000);
		fr.add(f2);
		Fruit f3 = new Fruit(3, "Pear", 1000);
		fr.add(f3);
		Fruit f4 = new Fruit(4, "Melon", 3000);
		fr.add(f4);
		Fruit f5 = new Fruit(5, "Lemon", 2500);
		fr.add(f5);
		Fruit f6 = new Fruit(6, "Lime", 1800);
		fr.add(f6);
		Fruit f7 = new Fruit(7, "WaterMelon", 10000);
		fr.add(f7);
		Fruit f8 = new Fruit(8, "Cherry", 7800);
		fr.add(f8);
		Fruit f9 = new Fruit(9, "Kakao", 7000);
		fr.add(f9);
		Fruit f10 = new Fruit(10, "Bean", 2300);
		fr.add(f10);
		
		Collections.sort(fr, new FruitComparator());
		for(Fruit f:fr) {
			System.out.println(f.toString());
		}
	}
}