package edu.ncsu.csc326.coffeemaker;

import junit.framework.Test;
import junit.framework.TestSuite;

public class InventoryTest extends TestSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite(InventoryTest.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(AddRecipeTest.class);
		suite.addTestSuite(CheckInventoryTest.class);
		suite.addTest(CoffeeMakerTest.suite());
		suite.addTestSuite(DeleteRecipeTest.class);
		suite.addTestSuite(EditRecipeTest.class);
		suite.addTestSuite(PurchaseCoffeeTest.class);
		suite.addTest(RecipeTest.suite());
		suite.addTestSuite(TheCoffeeMakerTest.class);
		//$JUnit-END$
		return suite;
	}

}
