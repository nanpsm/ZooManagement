import java.util.ArrayList;
import java.util.Scanner;

public class ZooManagement {
	static ArrayList<String> zoos = new ArrayList<String>();
	static boolean end = false;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the Zoo Management System!");
		
		mainMenu(true);
	}
	
	static void mainMenu(boolean firstTime) {
		if (!firstTime) {
			System.out.println("\n------------------------------------------------------");
		}
		System.out.println("\nZoo Management System");
		System.out.println("1. Manage Zoos");
		System.out.println("2. Manage Enclosures");
		System.out.println("3. Manage Animals");
		System.out.println("4. Exit");

		int choice = checkChoice(1, 4);
		
		switch (choice) {
			case 1: manageZoos(); break;
			case 2: manageEnclosures(); break;
			case 3: manageAnimals(); break;
			case 4: System.out.println("\nExiting Zoo Management System. Goodbye!"); break;
		}
	}
	
	static void manageZoos() {
		System.out.println("\n------------------------------------------------------\n\nZoo Management - Manage Zoos");
		System.out.println("1. Create new Zoo");
		System.out.println("2. Delete existing Zoo");
		System.out.println("3. Calculate total area of all enclosures in the zoo");
		System.out.println("4. Count total number of enclosures");
		System.out.println("5. Back to main menu");

		int choice = checkChoice(1, 5);
		
		if (choice == 1) {
			String zooName = "";
			System.out.println("\nEnter Zoo details:");
			
			while (true) {
				System.out.print("Name: ");
				zooName = input.next();
				
				if (zooName.equals("0")) {
					System.out.println("0 is invalid zoo name. Please input another name.");
				}
				else if (zoos.contains(zooName)) {
					System.out.println("Zoo name has been used. Please input another name.");
				}
				else {
					break;
				}
			}
			zoos.add(zooName);
			
			System.out.print("Description: ");
			String zooDesc = input.next();
			
			//call zoo class method
			
			System.out.println("\nZoo created successfully!");
		}
		
		if (choice == 2) {
			int zooChoice = selectZoo();
			if (zooChoice != 0) {
				zoos.remove(zooChoice - 1);
				System.out.println("\nZoo deleted successfully!");
			}
		}
		
		if (choice == 3) {
			int zooChoice = selectZoo();
			if (zooChoice != 0) {
				int totalArea = 0; //call zoo class method
				System.out.printf("\nTotal area of all enclosures in the zoo: %d square units%n", totalArea);
			}
		}
		
		if (choice == 4) {
			int zooChoice = selectZoo();
			if (zooChoice != 0) {
				int totalEnclosure = 0; //call zoo class method
				System.out.printf("\nTotal number of enclosures in the zoo: %d%n", totalEnclosure);
			}
		}
		
		if (choice == 5) mainMenu(false);
		else manageZoos();
	}
	
	static void manageEnclosures() {
		System.out.println("\n------------------------------------------------------\n\nZoo Management - Manage Enclosures");
		System.out.println("1. Add an Enclosure to a Zoo");
		System.out.println("2. Delete an existing Enclosure from a Zoo");
		System.out.println("3. Get utilised area in a given enclosure");
		System.out.println("4. Get percentage of utilised area in a given enclosure");
		System.out.println("5. Count number of species in an enclosure");
		System.out.println("6. Back to main menu");

		int choice = checkChoice(1, 6);
		
		if (choice == 1) {
			int zooChoice = selectZoo();
			if (zooChoice != 0) {
				System.out.println("\nEnter Enclosure details:");
				//call enclosure class method
				System.out.println("\nEnclosure added successfully!");
			}
		}
		if (choice == 2) {
			int zooChoice = selectZoo();
			if (zooChoice != 0) {
				//call enclosure class method
				System.out.println("\nEnclosure deleted successfully!");
			}
		}
		if (choice == 3) {
			
		}
		if (choice == 4) {
			
		}
		if (choice == 5) {
			
		}
		if (choice == 6) mainMenu(false);
		else manageEnclosures();
	}
	
	static void manageAnimals() {
		System.out.println("\n-----------------------------------------------------\n\nZoo Management - Manage Animals");
		System.out.println("1. Add animals to an Enclosure");
		System.out.println("2. Remove animals from an Enclosure");
		System.out.println("3. Check if an animal has a companion in its enclosure");
		System.out.println("4. Back to main menu");
	
		int choice = checkChoice(1, 4);
		
		if (choice == 1) {
			
		}
		if (choice == 2) {
			
		}
		if (choice == 3) {
			
		}
		if (choice == 4) mainMenu(false);
		else manageAnimals();
	}
	
	// ERROR HANDLING
	static int checkChoice(int start, int end) {
		while (true) {
			System.out.print("Enter your choice: ");
			
			try {
				int choice = input.nextInt();
				
				if (choice < start || choice > end) {
					System.out.println("Error. Please input correct choice.");
				}
				else {
					return choice;
				}
			}
			catch (Exception e) {
				System.out.println("Error. Please input correct choice.");
				input.reset();
				input.next();
			}
		}
	}
	
	static int selectZoo() {
		System.out.println("\nZoo list:");
		for (int i = 0; i<zoos.size(); i++) {
			System.out.printf("%d. %s%n", i+1, zoos.get(i));
		}
		System.out.println("0. Go back");
		int zooChoice = checkChoice(0, zoos.size());
		return zooChoice;
	}
	
	static String checkName(String type) {
		return type = "";
	}
}
