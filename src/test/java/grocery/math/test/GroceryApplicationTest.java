package grocery.math.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import grocery.application.GroceryApplication;
import grocery.products.Fruit;

public class GroceryApplicationTest {

	GroceryApplication groceryApplication = new GroceryApplication();

	@Test
	public void testcreateShoppingListSize() {
		List<Fruit> fruitList = new ArrayList<>();
		fruitList = groceryApplication.createShoppingList();
		assertEquals(10, fruitList.size());
	}

	@Test
	public void testcreateShoppingListFruitTypes() {
		List<Fruit> fruitList = new ArrayList<>();
		Set<String> fruitTypes = new HashSet<>();
		String[] arr = { "Apple", "Orange" };
		
		fruitList = groceryApplication.createShoppingList();
		for (Fruit fruit : fruitList) {
			fruitTypes.add(fruit.getClass().getSimpleName());
		}

		assertEquals(Arrays.toString(arr), fruitTypes.toString());
	}

}
