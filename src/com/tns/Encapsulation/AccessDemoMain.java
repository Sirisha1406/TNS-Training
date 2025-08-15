package com.tns.Encapsulation;
import java.util.Scanner;
public class AccessDemoMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AccessDemo ob=new AccessDemo();
		
		System.out.println("Enter employee name: ");
		String empname=sc.nextLine();
		
		System.out.println("Enter Salary: ");
		int salary=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Department: ");
		String department=sc.nextLine();
		
		ob.setempname(empname);
		ob.setsalary(salary);
		ob.setdepartment(department);
		
		
		System.out.println("/----Employee Details----/");
		System.out.println("Employee name: "+ ob.getempname());
		System.out.println("Salary: "+ ob.getsalary());
		System.out.println("Department: "+ ob.getdepartment());
		
		sc.close();
	}

}
