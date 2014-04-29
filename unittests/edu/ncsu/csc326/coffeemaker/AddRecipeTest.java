package edu.ncsu.csc326.coffeemaker;


import junit.framework.Assert;
import junit.framework.TestCase;

public class AddRecipeTest extends SetupTest{
	


	public void addMoreThan3Recipes() {
		Assert.assertTrue(cm.addRecipe(r1));
		Assert.assertTrue(cm.addRecipe(r2));
		Assert.assertTrue(cm.addRecipe(r3));
		Assert.assertFalse(cm.addRecipe(r4));
	}


	public void addRecipeTwice() {
		Assert.assertTrue(cm.addRecipe(r1));
		Assert.assertFalse(cm.addRecipe(r1));
	}


	public void addIdenticalRecipe(){
		Assert.assertTrue(cm.addRecipe(r1));

		Recipe r5 = new Recipe();
		r5.setAmtChocolate(r1.getAmtChocolate());
		r5.setAmtCoffee(r1.getAmtCoffee());
		r5.setAmtMilk((r1.getAmtMilk()));
		r5.setAmtSugar((r1.getAmtSugar()));
		r5.setPrice((r1.getPrice()));
		r5.setName((String.valueOf(r1.getName())));

		Assert.assertFalse(cm.addRecipe(r1));
	}


	public void addInconsistentRecipe() {
		Recipe recipe = new Recipe();
		recipe.setName("Test");

		Assert.assertFalse(cm.addRecipe(recipe));
	}
	

	public void setPrice(){
		r1.setPrice(-3);
	}


	public void addRecipeWithWrongPrice() {
		r1.setPrice((int) 7.5);
	}

	public void addRecipeWithWrongUnit() {
		r1.setAmtChocolate((int) 7.0);
	}


	public void addRecipeWithWrongUnit2(){
		r1.setAmtChocolate(-7);
	}



}
