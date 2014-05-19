package edu.ncsu.csc326.coffeemaker.tests;

import junit.framework.Assert;

public class PurchaseCoffeeTest extends SetupTest {

	// Insufficient funds to purchase.
	public void testPurchaseInsufficientFunds() {
		cm.addRecipe(r1);
		cm.addRecipe(r2);
		cm.addRecipe(r3);

		Assert.assertEquals(10, cm.makeCoffee(r1, 10));
	}

	public void testPurchaseExact() {
		cm.addRecipe(r1);
		cm.addRecipe(r2);
		cm.addRecipe(r3);

		Assert.assertEquals(0, cm.makeCoffee(r1, 50));
	}

	public void testPurchaseMore() {
		cm.addRecipe(r1);
		cm.addRecipe(r2);
		cm.addRecipe(r3);

		Assert.assertEquals(10, cm.makeCoffee(r1, 60));
	}

	public void testPurchaseNegative() {
		cm.addRecipe(r1);
		cm.addRecipe(r2);
		cm.addRecipe(r3);

		Assert.assertEquals(-60, cm.makeCoffee(r1, -60));
	}

	public void testPurchaseNoRecipe() {
		Assert.assertEquals(60, cm.makeCoffee(r5, 60));
	}

}
