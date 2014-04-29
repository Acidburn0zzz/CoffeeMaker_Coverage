package edu.ncsu.csc326.coffeemaker;

import junit.framework.Assert;

public class AddRecipeTestNew extends SetupTest {

	public void testAddMoreThan3Recipes() {
		Assert.assertTrue(cm.addRecipe(r1));
		Assert.assertTrue(cm.addRecipe(r2));
		Assert.assertTrue(cm.addRecipe(r3));
		Assert.assertTrue(cm.addRecipe(r4));
	}

}
