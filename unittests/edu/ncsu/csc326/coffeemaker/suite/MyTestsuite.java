package edu.ncsu.csc326.coffeemaker.suite;

import junit.framework.Test;
import junit.framework.TestSuite;
import edu.ncsu.csc326.coffeemaker.AddRecipeTest;
import edu.ncsu.csc326.coffeemaker.AddRecipeTestNew;
import edu.ncsu.csc326.coffeemaker.CheckInventoryTest;
import edu.ncsu.csc326.coffeemaker.CoffeeMakerTest;
import edu.ncsu.csc326.coffeemaker.DeleteRecipeTest;
import edu.ncsu.csc326.coffeemaker.EditRecipeTest;
import edu.ncsu.csc326.coffeemaker.PurchaseCoffeeTest;

public class MyTestsuite extends TestSuite {
	public static Test suite() {
		return new TestSuite(CoffeeMakerTest.class, AddRecipeTest.class,
				AddRecipeTestNew.class, CheckInventoryTest.class,
				DeleteRecipeTest.class, EditRecipeTest.class,
				PurchaseCoffeeTest.class);
	}
}
