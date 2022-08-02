package com.examples;

import java.util.ArrayList;
import java.util.Scanner;

public class Example4 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> al= new ArrayList<>();
		
		int count=0;
	  String option="N";
		
		do {
			System.out.println("Enter the user values :");
			al.add(sc.nextInt());
			System.out.println("Value saved");
			System.out.println("Do u want continue (Y/N)");
			option=sc.next();
			count++;
		} while (option.equalsIgnoreCase("Y"));
		System.out.println("All values are saved");
		System.out.println("Count "+ count);
		for(int i=0; i<al.size(); i++) {
			System.out.println("Values "+(i+1)+ ":" +al.get(i));
		}
	}

}
