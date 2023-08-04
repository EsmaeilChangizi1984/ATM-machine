package INTERFACE_JAVA;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Student Esmaeil = new Student("Esmaeil", 123);
		System.out.println(Esmaeil);
		saveRecords(Esmaeil);
		loadRecords(Esmaeil);
		retrievValues();

	}

	public static ArrayList<String> retrievValues() {

		ArrayList<String> values = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		int index = 0;

		System.out.println("Enter 1 to add values or 0 to quit!");

		while (!quit) {
			System.out.println("Enter your choice.");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 0:
				quit = true;
				break;

			case 1:
				System.out.println("Enter data");
				String input = scanner.nextLine();
				values.add(index, input);
				index++;
				break;
			}
		}
		return values;

	}
	
	

	public static void saveRecords(Student students) {
		for (int i = 0; i < students.addRecords().size(); i++) {
			System.out.println("Student " + students.addRecords().get(i) + " added to records.");
			
		}
	}
	
	

	public static void loadRecords(Student students) {
		ArrayList<String> values = retrievValues();
		students.retrievRecords(values);

	}

}
