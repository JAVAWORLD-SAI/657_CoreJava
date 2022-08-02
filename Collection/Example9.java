package com.examples;

import java.util.ArrayList;
import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		ArrayList<Employee> al= new ArrayList<>();
		Employee emp=null;
		int count =0;
		String option ="N";
		do {
			emp=new Employee();
			System.out.println("Enter the values "+ count++ + ":");
			System.out.println("eno :");
			emp.setEno(sc.nextInt());sc.nextLine();
			
			System.out.println("ename :");
			emp.setEname(sc.nextLine());
			
			System.out.println("sal :");
			emp.setSal(sc.nextDouble());
			
			System.out.println("exp :");
			emp.setExp(sc.nextDouble());
			
			System.out.println("desig :");
			emp.setDesig(sc.next());
			
			al.add(emp);
			System.out.println("Employees are saved");
			
			System.out.println("Do u want continue Y or N");
			option=sc.next();
		} while (option.equalsIgnoreCase("Y"));
		
		System.out.println("all empes are stored");
		System.out.println(al);
	}

}
