package genericsLambdas;

import java.util.List;
import java.util.ArrayList;

//Add a type parameter to the Inventory class to say that it works with a generic type
public class Inventory <T> {

//Define a list instance variable that takes a generic type parameter 
	List<T> genericList;
//Define a public constructor with no parameters that sets the list instance variable to an empty list
//(you can choose the type of list you want)
	public Inventory() {
		this.genericList = new ArrayList<>();
		
	}

//Define a function that returns all items in the list instance variable
	public List<T> getGenericList(){
		return this.genericList;
	}
	
//Define a function that takes an item of any type as input and adds it to the list
	public void addToGenericList( T item ) {
		this.genericList.add(item);
	}
//Define a funciton that takes an item of any type as input, removes it from the list, and then returns 
//the updated list
	public List<T> removeItemFromGenericList( T item ){
		this.genericList.remove(item);
		return this.genericList;
	}

//Define a function that returns the number of items currently in the list
	public int getGenericListSize() {
		return this.genericList.size();
	}

}

