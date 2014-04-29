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

	public void testAddInventory() {
		cm.addInventory(4, 7, 0, 9);
	}

	public void testCHeckInventory() {
		Assert.assertNotNull(cm.checkInventory());
	}

	public void testAddInventoryException() {
		cm.addInventory(4, -1, 3, 3);
	}

}
