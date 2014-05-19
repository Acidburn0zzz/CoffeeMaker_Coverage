package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.tests.AddRecipeTest;
import edu.ncsu.csc326.coffeemaker.tests.CheckInventoryTest;
import edu.ncsu.csc326.coffeemaker.tests.DeleteRecipeTest;
import edu.ncsu.csc326.coffeemaker.tests.EditRecipeTest;
import edu.ncsu.csc326.coffeemaker.tests.PurchaseCoffeeTest;
import edu.ncsu.csc326.coffeemaker.tests.TheCoffeeMakerTest;
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
