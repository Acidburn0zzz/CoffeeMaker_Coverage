package edu.ncsu.csc326.coffeemaker;

import junit.framework.Assert;

/**
 * Created by iamapo on 08.04.14.
 */

public class DeleteRecipeTest extends SetupTest {

	public void deleteInAEmptyBook() {

		Assert.assertEquals(cm.deleteRecipe(0), null);
	}

	public void deleteFirstRecipe() {
		cm.addRecipe(r1);
		Assert.assertEquals(cm.deleteRecipe(r1), "Coffee");
		Recipe recipe = cm.getRecipes()[0];
		Assert.assertNull(recipe);
	}

	public void doubleDelete() {
		cm.addRecipe(r1);
		cm.addRecipe(r2);
		cm.addRecipe(r3);

		Assert.assertEquals(cm.deleteRecipe(r1), "Coffee");
		Assert.assertNull(cm.deleteRecipe(r1));
	}

	public void deleteInTheMiddle() {
		cm.addRecipe(r1);
		cm.addRecipe(r2);
		cm.addRecipe(r3);
		Assert.assertEquals(cm.deleteRecipe(r2), "Mocha");
		Assert.assertNull(cm.deleteRecipe(r2));

	}

	public void deleteInvalifRecipe() {
		int outOfBounce = Integer.MAX_VALUE;
		Recipe recipe = cm.getRecipes()[outOfBounce];
	}

	public void invalidCharacter() {
		Recipe recipe = cm.getRecipes()[Integer.valueOf("Test")];
	}

}
