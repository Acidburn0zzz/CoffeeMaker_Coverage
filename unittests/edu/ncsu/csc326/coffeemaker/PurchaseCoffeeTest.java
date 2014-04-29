package edu.ncsu.csc326.coffeemaker;

import junit.framework.Assert;

public class PurchaseCoffeeTest extends SetupTest {
	// Insufficient funds to purchase.
	public void testPurchase1InsufficientFunds() {
		cm.addRecipe(r1);
		cm.addRecipe(r2);
		cm.addRecipe(r3);

		Assert.assertSame(10, cm.makeCoffee(r1, 10));
	}

	public void testPurchase2() {
		cm.addRecipe(r1);
		cm.addRecipe(r2);
		cm.addRecipe(r3);

		Assert.assertSame(0, cm.makeCoffee(r1, 50));
	}

	public void testPurchase3() {
		cm.addRecipe(r1);
		cm.addRecipe(r2);
		cm.addRecipe(r3);

		Assert.assertSame(10, cm.makeCoffee(r1, 60));
	}

	public void testPurchase4() {
		cm.addRecipe(r1);
		cm.addRecipe(r2);
		cm.addRecipe(r3);

		Assert.assertSame(60, cm.makeCoffee(r1, -60));
	}

	public void testPurchase5() {
		Assert.assertSame(60, cm.makeCoffee(r1, 60));
	}

}
