package ScannerExamples;
import java.util.Scanner;

public class SwitchDemo {

	static void display() {
		System.out.println("==========menu details==========");
		System.out.println("");
		System.out.println("1.veg biryani     - 170");
		System.out.println("2.pizza           - 270");
		System.out.println("3.chicken biryani - 299");
		System.out.println("4.burger          - 99 ");
		System.out.println("5.exit                 ");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
		display();
		System.out.println("Enter your choiice");
		choice = sc.nextInt();
		switch (choice) {
		case 1 -> System.out.println("veg biryani order successfully");
		case 2 -> System.out.println("ordered pizza");
		case 3 -> System.out.println("ordered chicken biryani");
		case 4 -> System.out.println("ordered burger");
		case 5 -> System.out.println("exit successfully");
		}
		}
		while(choice!=5);

		sc.close();
	}

}
