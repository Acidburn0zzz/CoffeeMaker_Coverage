package edu.ncsu.csc326.coffeemaker;

import junit.framework.Assert;

public class DeleteRecipeTest extends SetupTest {

	public void testDeleteInAEmptyBook() {

		Assert.assertEquals(false, cm.deleteRecipe(r1));
	}

	public void testDeleteFirstRecipe() {
		cm.addRecipe(r1);
		Assert.assertEquals(true, cm.deleteRecipe(r1));
		Recipe recipe = cm.getRecipes()[0];
	}

	public void testDoubleDelete() {
		cm.addRecipe(r1);
		cm.addRecipe(r2);
		cm.addRecipe(r3);

		Assert.assertEquals(true, cm.deleteRecipe(r1));
		Assert.assertEquals(true, cm.deleteRecipe(r1));
	}

	public void testDeleteInTheMiddle() {
		cm.addRecipe(r1);
		cm.addRecipe(r2);
		cm.addRecipe(r3);
		Assert.assertEquals(true, cm.deleteRecipe(r2));
		Assert.assertTrue(cm.deleteRecipe(r2));

	}

	public void testDeleteInvalifRecipe() {
		int outOfBounce = Integer.MAX_VALUE;
		try {
			Recipe recipe = cm.getRecipes()[outOfBounce];
		} catch (ArrayIndexOutOfBoundsException e) {
			//
		}
	}

	public void testInvalidCharacter() {
		try {
			Recipe recipe = cm.getRecipes()[Integer.valueOf("Test")];
		} catch (NumberFormatException e) {
			//
		}
	}

}
