package edu.ncsu.csc326.coffeemaker;

import junit.framework.Test;
import junit.framework.TestSuite;

public class RecipeTest extends TestSuite {

	public static Test suite() {
		return new TestSuite(TheCoffeeMakerTest.class, AddRecipeTest.class,
				CheckInventoryTest.class,
				DeleteRecipeTest.class, EditRecipeTest.class,
				PurchaseCoffeeTest.class);
	}
}
