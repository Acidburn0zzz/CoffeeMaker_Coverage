package edu.ncsu.csc326.coffeemaker;

import junit.framework.Assert;

public class EditRecipeTest extends SetupTest {

	public void checkRecipeCount() {
		Assert.assertEquals(3, cm.getRecipes().length);
		for (int i = 0; i < cm.getRecipes().length; i++) {
			Assert.assertNotNull(cm.getRecipes()[i]);
		}
	}

	public void chooseInvalifRecipe() {
		int outOfBounce = Integer.MAX_VALUE;
		Recipe recipe = cm.getRecipes()[outOfBounce];
	}

	public void wrongNumber() {
		Recipe recipe = cm.getRecipes()[Integer.valueOf("Test")];
	}

	public void nullRecipe() {
		cm.addRecipe(new Recipe());
		Recipe newOne = new Recipe();
		newOne.setName("Hot Chocolate2");
		newOne.setAmtChocolate(4);
		newOne.setAmtCoffee(0);
		newOne.setAmtMilk(1);
		newOne.setAmtSugar(1);
		newOne.setPrice(65);

		Assert.assertNull(cm.editRecipe(
				cm.getRecipes()[cm.getRecipes().length - 1], newOne));
	}

	public void changeRecipeName() {
		int number = 0;

		Recipe recipe = cm.getRecipes()[number];
		Assert.assertNotNull(recipe);

		String oldName = recipe.getName();
		recipe.setName("ChangedName");
		Assert.assertNull(cm.editRecipe(recipe, recipe));

		recipe = cm.getRecipes()[number];
		Assert.assertEquals(oldName, recipe.getName());
	}

	public void testPropertyChange() {
		int number = 0;

		Recipe recipe = cm.getRecipes()[number];
		Assert.assertNotNull(recipe);

		recipe.setAmtChocolate(20);
		Assert.assertEquals(false, cm.editRecipe(recipe, recipe));

		recipe = cm.getRecipes()[number];
		Assert.assertEquals(20, recipe.getAmtChocolate());
	}

}
