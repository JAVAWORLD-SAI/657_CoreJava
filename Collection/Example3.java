package com.examples;

import java.util.ArrayList;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> al= new ArrayList<>();
		
		int count =1;
		String option ="N";
		
		do {
			System.out.println("\n Enter the Value "+ count++  +" :");
				al.add(sc.nextInt());
				System.out.println("Values Saved");
				
				System.out.println("\n Do you want to Continue? (Y/N) : ");
					option=sc.next();
			
		} while (option.equalsIgnoreCase("Y"));
		System.out.println("\n All values your are Entered : ");
		System.out.println(al);
	}

}
