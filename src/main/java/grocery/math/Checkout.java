package grocery.math;

import java.util.List;

import grocery.products.Apple;
import grocery.products.Fruit;

public class Checkout {

	public int calculateShoppingList(List<Fruit> shoppingList) {

		int totalPrice = 0;
		int appleCounter = 0;
		int orangeCounter = 0;
		int price = 0;

		for (Fruit fruit : shoppingList) {
			price = fruit.getPrice();
			if (fruit instanceof Apple) {
				appleCounter++;
				if (appleCounter % 2 == 0) {
					price = 0;
					appleCounter = 0;
				}
			} else {
				orangeCounter++;
				if (orangeCounter % 3 == 0) {
					orangeCounter = 0;
					price = 0;

				}
			}

			totalPrice += price;
		}

		return totalPrice;

	}

}