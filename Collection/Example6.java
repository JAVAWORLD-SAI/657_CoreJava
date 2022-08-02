package com.examples;

import java.util.ArrayList;
import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> al= new ArrayList<>();
		int count=0;
		
		String option= "N";
		
		do {
			System.out.print("\n Enter the Values ");
			al.add(sc.nextInt());
			System.out.println("Values added");
			System.out.println("Do u want continue  (Y OR N) :");
			count ++;
		option=sc.next();
			
		} while (option.equalsIgnoreCase("Y"));
		System.out.println("All values are added");
		
		for(int i=0; i<al.size(); i++) {
			System.out.println("Vales "+ (i+1)+ ":" +al.get(i));
			System.out.println("Count is  :" +count);
			
			// searching or check or contains
			
			if(al.contains(10))
				System.out.println("Avalile ");
			else
				System.out.println("Not avalible ");
		}
	}

}
