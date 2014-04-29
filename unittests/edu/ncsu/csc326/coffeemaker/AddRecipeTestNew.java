package edu.ncsu.csc326.coffeemaker;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AddRecipeTestNew extends SetupTest{
	
	public void addMoreThan3Recipes() {
		Assert.assertTrue(cm.addRecipe(r1));
		Assert.assertTrue(cm.addRecipe(r2));
		Assert.assertTrue(cm.addRecipe(r3));
		Assert.assertFalse(cm.addRecipe(r4));
	}

}
