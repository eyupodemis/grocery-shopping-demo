package grocery.application;

import java.util.ArrayList;
import java.util.List;

import grocery.math.Checkout;
import grocery.products.Apple;
import grocery.products.Fruit;
import grocery.products.Orange;

public class GroceryApplication {
	public static void main(String[] args) {

		int totalAmoutofShopping = 0;
		GroceryApplication groceryApplication = new GroceryApplication();
		Checkout checkout = new Checkout();
		totalAmoutofShopping = checkout.calculateShoppingList(groceryApplication.createShoppingList());
		System.out.println("Total Amount:" + totalAmoutofShopping);
	}

	public List<Fruit> createShoppingList() {
		List<Fruit> fruitList = new ArrayList<>();

		for (int i = 0; i < 10; i++)
			if (Math.round(Math.random() * 10) % 2 == 0) {
				fruitList.add(new Apple());
				System.out.println("Apple added to the basket");
			} else {
				fruitList.add(new Orange());
				System.out.println("Orange added to the basket");
			}
		return fruitList;
	}
}
