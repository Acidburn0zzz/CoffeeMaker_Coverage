package edu.ncsu.csc326.coffeemaker.tests;

import edu.ncsu.csc326.coffeemaker.Inventory;
import junit.framework.Assert;

public class InventoryTest2 extends SetupTest {
	public void testEditRecipe() {
		Inventory inventory = new Inventory();
		
		Assert.assertNotNull(inventory.toString());
		Assert.assertTrue(inventory.toString().contains("Coffee"));
		Assert.assertTrue(inventory.toString().contains("Milk"));
		Assert.assertTrue(inventory.toString().contains("Sugar"));
		Assert.assertTrue(inventory.toString().contains("Chocolate"));
		Assert.assertTrue(inventory.toString() instanceof String);
	}
}
