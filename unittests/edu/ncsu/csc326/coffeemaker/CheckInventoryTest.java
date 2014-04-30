package edu.ncsu.csc326.coffeemaker;

import junit.framework.Assert;

public class CheckInventoryTest extends SetupTest {

	public void testAddInventory1() {
		cm.addInventory(10, 0, 10, 10);
	}

	public void testAddInventory2() {
		cm.addInventory(0, 10, 10, 10);
	}

	public void testAddInventory5() {
		cm.addInventory(-10, 10, 10, 10);
	}

	public void testAddInventory6() {
		cm.addInventory(10, -10, 10, 10);
	}

	public void testAddInventory7() {
		cm.addInventory(10, 10, -10, 10);
	}

	public void testAddInventory8() {
		cm.addInventory(10, 10, 10, -10);
	}

	public void testAddInventory9() {
		cm.addInventory(-10, -10, -10, -10);
	}

	public void testGetter() {
		Inventory inventory = new Inventory();
		Assert.assertEquals(inventory.getChocolate(), 15);
		Assert.assertEquals(inventory.getCoffee(), 15);
		Assert.assertEquals(inventory.getMilk(), 15);
		Assert.assertEquals(inventory.getSugar(), 15);
	}

	public void testToString() {
		Inventory inventory = new Inventory();
		Assert.assertNotNull(inventory.toString());
	}

	public void testSetter() {
		Inventory inventory = new Inventory();

		inventory.setChocolate(5);
		inventory.setCoffee(5);
		inventory.setMilk(5);
		inventory.setSugar(5);

		Assert.assertEquals(5, inventory.getChocolate());
		Assert.assertEquals(5, inventory.getCoffee());
		Assert.assertEquals(5, inventory.getMilk());
		Assert.assertEquals(5, inventory.getSugar());
	}
	
	public void testSetterLessThan0() {
		Inventory inventory = new Inventory();

		inventory.setChocolate(-1);
		inventory.setCoffee(-1);
		inventory.setMilk(-1);
		inventory.setSugar(-1);

		Assert.assertEquals(0, inventory.getChocolate());
		Assert.assertEquals(0, inventory.getCoffee());
		Assert.assertEquals(0, inventory.getMilk());
		Assert.assertEquals(0, inventory.getSugar());
	}

	public void testEnoughChocolate() {
		Inventory inventory = new Inventory();
		Recipe recipe = new Recipe();
		recipe.setAmtChocolate(15000);

		inventory.setChocolate(15);

		inventory.enoughIngredients(recipe);
	}

	public void testEnoughSugar() {
		Inventory inventory = new Inventory();
		Recipe recipe = new Recipe();
		recipe.setAmtSugar(15000);

		inventory.setSugar(15);

		inventory.enoughIngredients(recipe);
	}

	public void testEnoughMilk() {
		Inventory inventory = new Inventory();
		Recipe recipe = new Recipe();
		recipe.setAmtMilk(15000);

		inventory.setMilk(15);

		inventory.enoughIngredients(recipe);
	}

	public void testEnoughCoffee() {
		Inventory inventory = new Inventory();
		Recipe recipe = new Recipe();
		recipe.setAmtCoffee(15000);

		inventory.setCoffee(15);

		inventory.enoughIngredients(recipe);
	}

	public void testEqulas() {
		Recipe recipe = new Recipe();
		recipe.setName(null);

		Recipe recipe2 = new Recipe();
		recipe2.setName("Test");

		Assert.assertFalse(recipe.equals(recipe2));
	}

}
