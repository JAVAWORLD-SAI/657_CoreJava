package com.examples;

import java.util.ArrayList;
import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer>al= new ArrayList<>();
		
		int count=0;
		String option="N";
		
		do {
			System.out.println("Enter te Values ");
			
					al.add(sc.nextInt());
					System.out.println("Values are saved");
					System.out.println("Do u want continue");
					count++;
					option=sc.next();
			
		} while (option.equalsIgnoreCase("Y"));
		System.out.println("All values are saved");
		System.out.println("Count is  "+ count);
		for(int i=0; i<al.size(); i++) {
			System.out.println("values "+ (i+1) + ":" + al.get(i));
			
			int value=al.get(i);
			if(value%2==0) 
				al.remove(i);
		}
		System.out.println("odd numbers are "+ al);
	}

}
