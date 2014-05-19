package edu.ncsu.csc326.coffeemaker;

import junit.framework.Test;
import junit.framework.TestSuite;
// CoffeeMakerTest
public class CoffeeMakerTest extends TestSuite {
	public static Test suite() {
		return new TestSuite(TheCoffeeMakerTest.class, AddRecipeTest.class,
				CheckInventoryTest.class,
				DeleteRecipeTest.class, EditRecipeTest.class,
				PurchaseCoffeeTest.class);
	}
}
