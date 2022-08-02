package com.examples;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		//ArrayList<String> a1= new ArrayList<>();
		ArrayList<Object> a1= new ArrayList<>();
		a1.add("A1");
		a1.add("A2");
		a1.add("A3");
		System.out.println(a1);
		a1.add("A4");
		System.out.println(a1);
		//a1.add(5); Exception it allowed String type  and change String to object it allowed
		//System.out.println(a1);
		
		//a1.add(5);  // now it allowed
		//System.out.println(a1);
		
		a1.remove("A3");
		System.out.println(a1);
		
		a1.add(0, "A9");  // add value in  index based
		System.out.println(a1);
				
		//a1.sort(null);   add(5)  it not sorted homogenious
		//System.out.println(a1);
		
		a1.sort(null);
		System.out.println(a1);
		
		
		
		
		
		

	}

}
