package runners;

import java.util.*;
import beans.*;

public class App {

	private static List<Coffee> coffeeList = new ArrayList<>();
	private static List<Tea> teaList = new ArrayList<>();;
	private static Scanner scan = new Scanner(System.in);
	private static List Receipt=new ArrayList<Drinks>();

	static {
		coffeeList.add(new Coffee("Freshly Brewed Coffee", "tall", 5, 1.75));
		coffeeList.add(new Coffee("Freshly Brewed Coffee", "grande", 5, 2.10));
		coffeeList.add(new Coffee("Freshly Brewed Coffee", "venti", 5, 2.35));

		coffeeList.add(new Coffee("ICED COFFEE", "tall", 5, 2.25));
		coffeeList.add(new Coffee("ICED COFFEE", "grande", 5, 2.65));
		coffeeList.add(new Coffee("ICED COFFEE", "venti", 5, 2.95));

		coffeeList.add(new Coffee("Caffe AMericano", "tall", 10, 2.25));
		coffeeList.add(new Coffee("Caffe AMericano", "grande", 15, 2.65));
		coffeeList.add(new Coffee("Caffe AMericano", "venti", 25, 2.95));

		coffeeList.add(new Coffee("Flat White", "tall", 170, 3.75));

		coffeeList.add(new Coffee("CARAMEL MACCHIATO", "tall", 180, 3.65));
		coffeeList.add(new Coffee("CARAMEL MACCHIATO", "grande", 240, 4.25));
		coffeeList.add(new Coffee("CARAMEL MACCHIATO", "venti", 300, 4.65));

		teaList.add(new Tea("CINNAMON CHAI LATTE", "tall", 150, 3.45));
		teaList.add(new Tea("CINNAMON CHAI LATTE", "grande", 200, 4.25));
		teaList.add(new Tea("CINNAMON CHAI LATTE", "venti", 250, 4.65));

		teaList.add(new Tea("CLASSIC CHAI TEA LATTE", "tall", 190, 3.25));
		teaList.add(new Tea("CLASSIC CHAI TEA LATTE", "grande", 240, 3.95));
		teaList.add(new Tea("CLASSIC CHAI TEA LATTE", "venti", 310, 4.25));

		teaList.add(new Tea("PEACH GREEN TEA LEMONADE", "tall", 100, 2.75));
		teaList.add(new Tea("PEACH GREEN TEA LEMONADE", "grande", 130, 3.25));
		teaList.add(new Tea("PEACH GREEN TEA LEMONADE", "venti", 190, 3.75));

		teaList.add(new Tea("SHAKEN ICED TEA", "tall", 60, 1.75));
		teaList.add(new Tea("SHAKEN ICED TEA", "grande", 80, 2.25));
		teaList.add(new Tea("SHAKEN ICED TEA", "venti", 120, 2.65));

		teaList.add(new Tea("VERY BERRY HIBISCUS", "tall", 60, 2.95));
		teaList.add(new Tea("VERY BERRY HIBISCUS", "grande", 70, 3.45));
		teaList.add(new Tea("VERY BERRY HIBISCUS", "venti", 100, 3.95));
	}

	public static void run() {
		System.out.println("==========================STARBUCKS===================== ");
		System.out.println("\n\n\t\t\tMARHABA HABIBI!");
		System.out.println("\n\n==========================MENU===========================");
		System.out.println("\n\n==============================COFFEE===================================");
		System.out.println(coffeeList);
		System.out.println("\n\n=================================TEA====================================");
		System.out.println(teaList);
		System.out.println("=============================================================================");
		double totalPrice = 0;
		int totalCalories = 0;

		System.out.println("\n\nYour Budget: ");
		double budget = scan.nextDouble();
		
		System.out.println("Your Calories: ");
		int caloriesLimit = scan.nextInt();
		while (true) {

			System.out.println("Please select your Drink Type: ");

			String Sselection = scan.next();
			

			if (Sselection.equalsIgnoreCase("coffee")) {
				
				System.out.println("Please select your " + Sselection + " Type: ");
				int selection = scan.nextInt();
				
				if (selection <= 0 || selection > coffeeList.size()) {
					System.out.println("Invalid Selection.Please try another option.");
					continue;
				}

				Coffee coffee = coffeeList.get(selection - 1);
				System.out.println(coffee);
				if (budget >= (coffee.getPrice() + totalPrice)
						&& caloriesLimit >= (coffee.getCalories() + totalCalories)) {
					Receipt.add(coffee);
					totalPrice += coffee.getPrice();
					totalCalories += coffee.getCalories();
					
				} else {
					if(budget < (coffee.getPrice() + totalPrice)) {
					System.out.println("\nCrossing budget.Need more money.\n");
					System.out.println("===========================Receipt===========================");
					System.out.println(Receipt);
					System.out.println("==========================================================");
					System.out.println("Total Price: " + totalPrice + " $");
					System.out.println("Total Calories: " + totalCalories);
					System.out.println("==========================================================");
					break;
					}
					else if(caloriesLimit < (coffee.getCalories() + totalCalories)){
						System.out.println("\nCrossing calorie Limit.\n");
						System.out.println("==========================Receipt===========================");
						System.out.println(Receipt);
						System.out.println("==========================================================");
						System.out.println("Total Price: " + totalPrice + " $");
						System.out.println("Total Calories: " + totalCalories);
						System.out.println("==========================================================");
					break;
					}
				}
			}

			else if (Sselection.equalsIgnoreCase("tea")) {
				System.out.println("Please select your " + Sselection + ": ");
				int selection = scan.nextInt();
				if (selection <= 0 || selection > teaList.size()) {
					System.out.println("Invalid Selection.Please try another option.");
					continue;
				}

				Tea tea = teaList.get(selection - 1);
				System.out.println(tea);
				if (budget > (tea.getPrice() + totalPrice) && caloriesLimit > (tea.getCalories() + totalCalories)) {
					Receipt.add(tea);
					totalPrice += tea.getPrice();
					totalCalories += tea.getCalories();
				} else {
					if(budget < (tea.getPrice() + totalPrice)) {
						System.out.println("\nCrossing budget.Need more money.\n");
						System.out.println("=======================Receipt===========================");
						System.out.println(Receipt);
						System.out.println("==========================================================");
						System.out.println("Total Price: " + totalPrice + " $");
						System.out.println("Total Calories: " + totalCalories);
						System.out.println("==========================================================");
						break;
						}
						else if(caloriesLimit < (tea.getCalories() + totalCalories)){
							System.out.println("\nCrossing calorie Limit.\n");
							System.out.println("========================Receipt============================");
							System.out.println(Receipt);
							System.out.println("==========================================================");
							System.out.println("Total Price: " + totalPrice + " $");
							System.out.println("Total Calories: " + totalCalories);
							System.out.println("==========================================================");
							break;
						}				}
			} else {
				System.out.println("Invalid Drink selected.Please try another option.\n\n");
			}

			System.out.println("\nTotal Price: " + totalPrice + " $");
			System.out.println("Total Calories: " + totalCalories);
			System.out.println("\n");
		}

	}
}
