package com.examples;

import java.util.ArrayList;
import java.util.Scanner;

public class Example7 {
	
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 ArrayList<Object> al= new ArrayList<>();
		 
		 int count=0;
		 String option="N";
		 
		 do {
			System.out.print("\n Enter the Number");
						al.add(sc.nextInt());
						System.out.print("Values added");
						System.out.println("Do u want Continue (Y / N) ");
						count++;
					option=sc.next();
		} while (option.equalsIgnoreCase("Y"));
		 System.out.println("ALL VALUES ARE ADDED");
		 System.out.println("COUNT : "+ count);
		 	
		 for(int i=0; i<al.size(); i++) {
			 System.out.println("Values  "+(i+1)+ ": "+ al.get(i));
			 int value= (int) al.get(i);
			 
			 if(value%2==0)
				 al.remove(i);
		 }
		 System.out.println(al);
		 
		 if(al.contains(20))
			 System.out.println("availble");
		 else
			 System.out.println("Not avalible");
		 
		 
		 int size=al.size()*2;
		 
		 char ch='A';
		 
		 for (int i=1; i<al.size(); i+=2) {
			 al.add(i, ch++);
			 }
		 System.out.println(al);
		 
		 for(int i=1; i<al.size(); i++) {
			 al.set(i, al.get(i)+ "B");
		 }
		 System.out.println(al);
	}
				

}
