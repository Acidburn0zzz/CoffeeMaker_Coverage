package edu.ncsu.csc326.coffeemaker;

import junit.framework.Assert;

public class EditRecipeTest extends SetupTest {

	public void testcheckRecipeCount() {
		Assert.assertEquals(4, cm.getRecipes().length);
		for (int i = 0; i < cm.getRecipes().length; i++) {
			Assert.assertNotNull(cm.getRecipes()[i]);
		}
	}

	public void testChooseInvalifRecipe() {
		int outOfBounce = Integer.MAX_VALUE;
		try {
			Recipe recipe = cm.getRecipes()[outOfBounce];
		} catch (ArrayIndexOutOfBoundsException e) {
			//
		}
	}

	public void testWrongNumber() {
		try {
			Recipe recipe = cm.getRecipes()[Integer.valueOf("Test")];
		} catch (NumberFormatException e) {
			//
		}
	}

	public void testnullRecipe() {
		cm.addRecipe(new Recipe());
		Recipe newOne = new Recipe();
		newOne.setName("Hot Chocolate2");
		newOne.setAmtChocolate(4);
		newOne.setAmtCoffee(0);
		newOne.setAmtMilk(1);
		newOne.setAmtSugar(1);
		newOne.setPrice(65);

		Assert.assertFalse(cm.editRecipe(
				cm.getRecipes()[cm.getRecipes().length - 1], newOne));
	}

	public void testEditRecipe() {
		// todo: prüfen ob der Test so sinnvoll ist, hab nur auf 100% Coverage geachtet
		cm.addRecipe(r1);
		cm.addRecipe(r2);
		cm.addRecipe(r3);
		cm.addRecipe(r4);
		
		Assert.assertFalse(cm.editRecipe(r1, r1));
	}
	

	public void testchangeRecipeName() {
		int number = 0;

		Recipe recipe = cm.getRecipes()[number];
		Assert.assertNotNull(recipe);

		String oldName = recipe.getName();
		recipe.setName("ChangedName");
		Assert.assertTrue(cm.editRecipe(recipe, recipe));

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
