package edu.ncsu.csc326.coffeemaker;

import junit.framework.Assert;

/**
 * 
 * @author Sarah Heckman
 * 
 *         Unit tests for CoffeeMaker class.
 */
public class CoffeeMakerTest extends SetupTest {

	public void testMakeCoffee() {
		Assert.assertEquals(25, cm.makeCoffee(r1, 75));
	}

	public void testDontMakeCoffee() {
		r1.setAmtChocolate(99999);
		r1.setAmtCoffee(99999);
		r1.setAmtMilk(99999);
		r1.setAmtSugar(99999);

		Assert.assertEquals(2, cm.makeCoffee(r1, 2));
	}

	public void testAddRecipe5() {
		Assert.assertTrue(cm.addRecipe(r1));
		Assert.assertTrue(cm.addRecipe(r2));
		Assert.assertTrue(cm.addRecipe(r3));
		Assert.assertTrue(cm.addRecipe(r4));
		Assert.assertFalse(cm.addRecipe(r5));
	}

	public void testGetRecipeForName() {
		cm.addRecipe(r1);
		cm.addRecipe(r2);
		cm.addRecipe(r3);

		Assert.assertNotNull(cm.getRecipeForName("Coffee"));
	}

	public void testAddInventory() {
		cm.addInventory(4, 7, 0, 9);
	}

	public void testDeleteNull() {
		Assert.assertFalse(cm.deleteRecipe(null));
	}

	public void testCHeckInventory() {
		Assert.assertNotNull(cm.checkInventory());
	}

	public void testAddInventoryException() {
		cm.addInventory(4, -1, 3, 3);
	}

}
