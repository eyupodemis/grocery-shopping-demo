package grocery.math.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import grocery.math.Checkout;
import grocery.products.Apple;
import grocery.products.Fruit;
import grocery.products.Orange;

public class CheckoutTest {

	List<Fruit> shoppingList = new ArrayList<>();
	public Checkout checkout = new Checkout();

	@Test
	public void testCalculateShoppingListRandomly() {
		shoppingList.add(new Apple());
		shoppingList.add(new Apple());
		shoppingList.add(new Orange());
		shoppingList.add(new Apple());
		shoppingList.add(new Orange());
		shoppingList.add(new Apple());
		shoppingList.add(new Orange());
		shoppingList.add(new Orange());
		int totalAmount = checkout.calculateShoppingList(shoppingList);
		assertEquals(195, totalAmount);
	}

	@Test
	public void testCalculateShoppingListWithApple() {
		shoppingList.add(new Apple());
		shoppingList.add(new Apple());
		shoppingList.add(new Apple());
		shoppingList.add(new Apple());
		shoppingList.add(new Apple());
		int totalAmount = checkout.calculateShoppingList(shoppingList);
		assertEquals(180, totalAmount);
	}

	@Test
	public void testCalculateShoppingListWitoutFruit() {
		int totalAmount = checkout.calculateShoppingList(shoppingList);
		assertEquals(0, totalAmount);
	}

}
