import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	//create an object to give access
	private static  GroceryList groceryList = new GroceryList();
	
	
	public static void main(String[] args) {
		boolean quit=false;
		int choice = 0;
		printInstructions();
		while (!quit) {
			System.out.println("Enter your choice:");
			choice = scanner.nextInt();
			scanner.nextLine();//if you want to add any string you need to add one line
			
			switch(choice) {
			case 0:
				printInstructions();//instructions ever pick 1,2,3
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				guit = true;
				break;
				
			
			}
		}

	}


	private static void searchForItem() {
		System.out.println("What item are you looking for?");
		String item = scanner.nextLine();
		groceryList.findItem(item);
		
		
	}


	private static void removeItem() {
		System.out.println("Whitch item number you want to remove");
		int position = scanner.nextInt();
		groceryList.removeGroceryItem(position);
		
		
	}


	private static void modifyItem() {
		
	   System.out.println("Modify your Item");
	   int modifyNumber = scanner.nextInt();
	   
	   System.out.println("Add your new item");
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryItem(modifyNumber, newItem);
		
	}


	private static void addItem() {
		System.out.println("Enter your choice:");
		String item = scanner.nextLine();
		groceryList.addGroceryItem(item);
		
		
		
	}


	private static void printInstructions() {
		System.out.println("Enter your choice: /n 1-print grocery; /n 2-add Item; /n 3-modify Item; n/4-remove Item;n/ 5-search for Item;/n 6-quit;");
		
		
	}

}//we have to create this methods, we will combine it with scaner 2willrun the method
