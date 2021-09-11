package com.example.lab2;

public class Fruit {
	int no;
	String name;
	int price;
	
	Fruit(int n, String nm, int p) {
		no = n;
		name = nm;
		price = p;
	}
	
	public String toString() {
		return "Fruit [no="+no+", name="+name+", price="+price+"]";
	}
}