package ScannerExamples;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id: ");
		int id=sc.nextInt();
		
		System.out.println("Enter name: ");
		String name=sc.next();
		
		sc.nextLine();
		System.out.println("Enter full name: ");
		String fullname=sc.nextLine();
		
		
		System.out.println("Enter the Martial status:");
		String status=sc.next();
		
		System.out.println("Enter your salary: ");
		double salary=sc.nextDouble();
		
		sc.nextLine();
		System.out.println("Enter your address");
		String address=sc.nextLine();
		
		
		System.out.println("Enter you ATM pin: ");
		int pin=sc.nextInt();
		
		System.out.println("Enter your Increment: ");
		double increment=sc.nextDouble();
		
		System.out.println("Enter your height");
		double height=sc.nextDouble();
		
		System.out.println("Enter the phone number: ");
		long phone=sc.nextLong();
		
		System.out.println("Enter your aadhar number: ");
		long aadhar=sc.nextLong();
		
		System.out.println("Employee ID         : "+id);
		System.out.println("Employee name       : "+name);
		System.out.println("Employee Full name  : "+fullname);
		System.out.println("Martial status      : "+status);
		System.out.println("Employee salary     : "+salary);
		System.out.println("Employee address    : "+address);
		System.out.println("Employee pin        : "+pin);
		System.out.println("Employee increment  : "+increment);
		System.out.println("Employee height     : "+height);
		System.out.println("Employee Phonenumber: "+phone);
		System.out.println("Employee aadhar     : "+aadhar);
		
		sc.close();
	}

}
