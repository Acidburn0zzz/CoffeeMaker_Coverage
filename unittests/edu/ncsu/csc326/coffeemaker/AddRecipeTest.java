package edu.ncsu.csc326.coffeemaker;

import junit.framework.Assert;

public class AddRecipeTest extends SetupTest {

	public void addMoreThan3Recipes() {
		Assert.assertTrue(cm.addRecipe(r1));
		Assert.assertTrue(cm.addRecipe(r2));
		Assert.assertTrue(cm.addRecipe(r3));
		Assert.assertFalse(cm.addRecipe(r4));mnh
	}

	public void testAddRecipeTwice() {
		Assert.assertTrue(cm.addRecipe(r1));
		Assert.assertFalse(cm.addRecipe(r1));
	}

	public void testAddIdenticalRecipe() {
		Assert.assertTrue(cm.addRecipe(r1));

		Recipe r5 = new Recipe();
		r5.setAmtChocolate(r1.getAmtChocolate());
		r5.setAmtCoffee(r1.getAmtCoffee());
		r5.setAmtMilk((r1.getAmtMilk()));
		r5.setAmtSugar((r1.getAmtSugar()));
		r5.setPrice((r1.getPrice()));
		r5.setName((r1.getName()));

		Assert.assertFalse(cm.addRecipe(r1));
	}

	public void testAddInconsistentRecipe() {
		Recipe recipe = new Recipe();
		recipe.setName("Test");

		Assert.assertFalse(cm.addRecipe(recipe));
	}

	public void testSetPrice() {
		r1.setPrice(-3);
		Assert.assertEquals(0, r1.getPrice());
	}

	public void testAddRecipeWithNegativeAmount1() {
		r1.setAmtChocolate(-7);
		Assert.assertEquals(0, r1.getAmtChocolate());
	}

	public void testToString() {
		Assert.assertNotNull(r1.toString());
	}

	public void testHashcode() {
		Assert.assertNotNull(r1.hashCode());
	}

}
