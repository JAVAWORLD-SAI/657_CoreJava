package com.examples;

import java.util.ArrayList;
import java.util.Collection;

public class ColMethodDemo {

	public static void main(String[] args) {
		Collection< String> col= new ArrayList<>();
		col.add("SAICHAND");
		col.add("SAI RAM");
		col.add("COOPER");
		col.add("LIZMIN");
		col.add("AJOL");
		col.add("");
		System.out.println(col);
		col.removeAll(col);
		System.out.println(col);
		col.contains(col.add("DON"));
		System.out.println(col);
		col.clear();
		System.out.println(col);
		

	}

}
