package genericsLambdas;

public class Product {
	//define the instance variables for 'name' and 'price'
	String name;
	double price;

	//define a public constructor for Product that takes a name and price as input and sets the instance variables accordingly
	public Product( String name, double price) {
		this.name = name;
		this.price = price;
		
	}

	public static void main(String[] args) {
		//Make an Inventory object that holds Products
		Inventory<Product> myInventory = new Inventory<>();
		
		//Add as many products as you want to your Inventory Object using the addItem() method you defined 
		myInventory.addToGenericList(new Product( MacBook, 1000.00));
		myInventory.addToGenericList(new Product( Coffee, 3.50));
		myInventory.addToGenericList(new Product( Car, 20000.00));
		myInventory.addToGenericList(new Product( Vacuum Cleaner, 200.00));
		myInventory.addToGenericList(new Product( Camera, 250.00));


		//Your task is to calculate the total price of all products in an Inventory object called myInventory. Follow these steps:
		//1. Call the getItems method on your inventory object to retrieve the list of all products.
		//2. Convert this list into a stream by calling the stream method.
		//3. Apply the mapToDouble operation to this stream. The operation should be applied to each Product object 
		//	 	in the stream, converting it into its price. Use the lambda expression product -> product.price to 
		//		perform this conversion. This expression means "for each product, return its price".
		//4. Apply the sum operation to the stream to get the total price of all products.
		//5. Store this total price in a double variable called priceTotal.
		//6. Print out priceTotal to the console to make sure you are properly summing your Products!
		
		double priceTotal = myInventory.getGenericList().stream().mapToDouble( item -> item.price ).sum();
		System.out.println(priceTotal);
		
		//Helpful documentation:
		//https://www.baeldung.com/java-stream-sum#using-streamsum-with-objects

	}

}

