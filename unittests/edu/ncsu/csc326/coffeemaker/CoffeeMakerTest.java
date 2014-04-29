package edu.ncsu.csc326.coffeemaker;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * 
 * @author Sarah Heckman
 * 
 *         Unit tests for CoffeeMaker class.
 */
public class CoffeeMakerTest extends TestCase {

	// Beispiel:
	//
	// private CoffeeMaker cm;
	// private Inventory i;
	// private Recipe r1;
	//
	// public void setUp() {
	// cm = new CoffeeMaker();
	// i = cm.checkInventory();
	//
	// r1 = new Recipe();
	// r1.setName(Coffee);
	// r1.setPrice(50);
	// r1.setAmtCoffee(6);
	// r1.setAmtMilk(1);
	// r1.setAmtSugar(1);
	// r1.setAmtChocolate(0);
	// }
	//
	// public void testAddRecipe() {
	// assertTrue(cm.addRecipe(r1));
	// }

	private CoffeeMaker cm;
	private Recipe r1;
	private Recipe r2;
	private Recipe r3;
	private Recipe r4;

	public void setUp() throws Exception {
		cm = new CoffeeMaker();

		// Set up for r1
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setAmtChocolate(0);
		r1.setAmtCoffee(3);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setPrice(50);

		// Set up for r2
		r2 = new Recipe();
		r2.setName("Mocha");
		r2.setAmtChocolate(20);
		r2.setAmtCoffee(3);
		r2.setAmtMilk(1);
		r2.setAmtSugar(1);
		r2.setPrice(75);

		// Set up for r3
		r3 = new Recipe();
		r3.setName("Latte");
		r3.setAmtChocolate(0);
		r3.setAmtCoffee(3);
		r3.setAmtMilk(3);
		r3.setAmtSugar(1);
		r3.setPrice(100);

		// Set up for r4
		r4 = new Recipe();
		r4.setName("Hot Chocolate");
		r4.setAmtChocolate(4);
		r4.setAmtCoffee(0);
		r4.setAmtMilk(1);
		r4.setAmtSugar(1);
		r4.setPrice(65);
	}

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
