package edu.ncsu.csc326.coffeemaker.tests;

import edu.ncsu.csc326.coffeemaker.CoffeeMaker;
import edu.ncsu.csc326.coffeemaker.Recipe;
import junit.framework.Assert;

/**
 * 
 * @author Sarah Heckman
 * 
 *         Unit tests for CoffeeMaker class.
 */
public class TheCoffeeMakerTest extends SetupTest {

	public void testMakeCoffee() {
		Assert.assertEquals(25, cm.makeCoffee(r1, 75));
	}

	public void testDontMakeCoffee() {
		r1.setAmtChocolate(99999);
		r1.setAmtCoffee(99999);
		r1.setAmtMilk(99999);
		r1.setAmtSugar(99999);

		Assert.assertEquals(2, cm.makeCoffee(r1, 2));
	}

	public void testAddRecipe5() {
		Assert.assertTrue(cm.addRecipe(r1));
		Assert.assertTrue(cm.addRecipe(r2));
		Assert.assertTrue(cm.addRecipe(r3));
		Assert.assertTrue(cm.addRecipe(r4));
		Assert.assertFalse(cm.addRecipe(r5));
	}

	public void testGetRecipeForName() {
		cm.addRecipe(r1);
		cm.addRecipe(r2);
		cm.addRecipe(r3);

		Assert.assertNotNull(cm.getRecipeForName("Coffee"));
	}

	public void testAddInventory() {
		cm.addInventory(4, 7, 0, 9);
	}

	public void testDeleteNull() {
		Assert.assertFalse(cm.deleteRecipe(null));
	}

	public void testCheckInventory() {
		Assert.assertNotNull(cm.checkInventory());
	}

	public void testAddInventoryException() {
		cm.addInventory(4, -1, 3, 3);
	}

	public void testCoffeMakerPush() {
		r1.setName("Zauberzutat");
		cm.addRecipe(r1);
		cm.addRecipe(r2);
		cm.addRecipe(r3);

		Assert.assertNotNull(cm.getRecipeForName("bliBlaBlubb"));
		Assert.assertNotNull(cm.getRecipeForName("Zauberzutat"));

	}

	public void testCoffeMakerPush2() {
		cm = new CoffeeMaker();
		Assert.assertTrue(cm.addInventory(100, 100, 100, 100));

		Assert.assertTrue(cm.checkInventory().getChocolate() > 100);
		Assert.assertTrue(cm.checkInventory().getCoffee() > 100);
		Assert.assertTrue(cm.checkInventory().getMilk() > 100);
		Assert.assertTrue(cm.checkInventory().getSugar() > 100);
	}

	public void testCoffeMakerPush3() {
		cm.addInventory(85, 85, 85, 85);
		System.out.println(cm.checkInventory().getChocolate());
		r1.setPrice(10);
		r1.setAmtChocolate(50);
		r1.setAmtSugar(50);
		r1.setAmtCoffee(10);
		r1.setAmtMilk(50);
		r1.setAmtChocolate(50);

		Assert.assertEquals(10, cm.makeCoffee(r1, 20));

		Assert.assertEquals(50, cm.checkInventory().getChocolate());
		Assert.assertEquals(50, cm.checkInventory().getMilk());
		Assert.assertEquals(50, cm.checkInventory().getSugar());
		Assert.assertEquals(110, cm.checkInventory().getCoffee());
	}

	public void testCoffeMakerPush4() {
		Assert.assertTrue(cm.addRecipe(r1));
		Assert.assertTrue(cm.addRecipe(r2));
		Assert.assertTrue(cm.addRecipe(r3));
		Assert.assertTrue(cm.addRecipe(r4));
		Assert.assertFalse(cm.addRecipe(r1));
		Assert.assertFalse(cm.addRecipe(r2));
		Assert.assertFalse(cm.addRecipe(r3));
		Assert.assertFalse(cm.addRecipe(r4));
		Recipe[] recipes = cm.getRecipes();
		Assert.assertTrue(recipes.length > 0);

		String nameAtIndex0 = recipes[0].getName();
		Assert.assertEquals(nameAtIndex0, cm.getRecipeForName(nameAtIndex0)
				.getName());

		// delete it
		Assert.assertTrue(cm.deleteRecipe(r4));
	}

	public void testCoffeMakerPush5() {
		Assert.assertFalse(cm.addInventory(-85, -85, -85, -85));
	}

	public void testCoffeMakerPush6() {
		Assert.assertEquals(4, cm.getRecipes().length);

		Recipe[] recipes = cm.getRecipes();
		try {
			Recipe recipe = recipes[4];
			throw new IllegalArgumentException();
		} catch (Exception e) {
			Assert.assertTrue(e instanceof ArrayIndexOutOfBoundsException);
		}
	}

}
