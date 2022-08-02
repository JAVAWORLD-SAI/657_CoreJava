package com.examples;

import java.util.ArrayList;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		ArrayList<Integer> al= new ArrayList<>();
		String option ="N";
		
		do {
			System.out.print("\n Enter the Number");
			al.add(sc.nextInt());
			System.out.println("Values are stored");
			System.out.println("Do u want continue (Y or N)");
			option=sc.next();
		} while (option.equalsIgnoreCase("Y"));
		System.out.println("All values are stored");
		
		al.sort(null);
		System.out.println("sort method "+ al);
		
		//comparator --> compare method and functional interface jdk 1.2
		al.sort((t1, t2) ->t1-t2);
		System.out.println("Ascending order : " + al);
		
		
		al.sort((t1,t2)->t2-t1);
		System.out.println("Decending order :" + al);
	}

}
