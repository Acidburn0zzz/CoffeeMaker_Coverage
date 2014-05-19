package edu.ncsu.csc326.coffeemaker;

import junit.framework.Test;
import junit.framework.TestSuite;
import edu.ncsu.csc326.coffeemaker.tests.AddRecipeTest;
import edu.ncsu.csc326.coffeemaker.tests.CheckInventoryTest;
import edu.ncsu.csc326.coffeemaker.tests.DeleteRecipeTest;
import edu.ncsu.csc326.coffeemaker.tests.EditRecipeTest;
import edu.ncsu.csc326.coffeemaker.tests.InventoryTest2;
import edu.ncsu.csc326.coffeemaker.tests.PurchaseCoffeeTest;
import edu.ncsu.csc326.coffeemaker.tests.TheCoffeeMakerTest;

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
		suite.addTestSuite(InventoryTest2.class);
		//$JUnit-END$
		return suite;
	}

}
