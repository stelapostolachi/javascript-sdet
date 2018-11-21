import java.util.ArrayList;//Example ArrayList methods
import java.util.List;//I imported class ArrayList

public class GroceryList {

	//List groceryList = new ArrayList();//Object created;1 way
	
	List<String>groceryList = new ArrayList<String>();//you specify I want to work with the string.2 way,created array list
	//create first method
	public void addGroceryItem(String item) {
		groceryList.add(item);//adding items in array .add(your item inside)
	}
	
	
	public void printGroceryList() {
		System.out.println("You have "+groceryList.size()+" Items in your list");//.size();you can see how many items in your list
		for(int i=0;i<groceryList.size();i++) {
			System.out.println((i+1)+"."+groceryList.get(i));
		}
	}
	
	
	//I want to modify something
	public void modifyGroceryItem(int position, String newItem) {
		//you need to know which item you want
		  groceryList.set(position, newItem);//position index num,
		
	}
	
	
	public void removeGroceryItem(int position) {
		
		groceryList.remove(position);//.remove( and indexnumber);
		
	}
	
	public String findItem(String searchItem) {
		boolean exists = groceryList.contains(searchItem);//.contains(searchItem)returns true or false
		int position = groceryList.indexOf(searchItem);//.indexOf(searchItem) returning index number
		if(position >=0) {
			return groceryList.get(position);
		}
		return null;//if doesen't exist return null
	}
}
