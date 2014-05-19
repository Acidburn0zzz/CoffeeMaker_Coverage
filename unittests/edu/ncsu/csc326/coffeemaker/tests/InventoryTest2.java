package edu.ncsu.csc326.coffeemaker.tests;

import edu.ncsu.csc326.coffeemaker.Inventory;
import junit.framework.Assert;

public class InventoryTest2 extends SetupTest {
	public void testEditRecipe() {
		Inventory inventory = new Inventory();
		
		Assert.assertNotNull(inventory.toString());
		Assert.assertTrue(inventory.toString().contains("Coffee"));
		Assert.assertTrue(inventory.toString().contains("Milk"));
		Assert.assertTrue(inventory.toString().contains("Sugar"));
		Assert.assertTrue(inventory.toString().contains("Chocolate"));
		Assert.assertTrue(inventory.toString() instanceof String);
		
		Assert.assertTrue(inventory.toString().length() > 1);
	}
	
	public void testPush2() {
		Inventory inventory = new Inventory();
		
		r1.setAmtChocolate(5);
		r1.setAmtCoffee(5);
		r1.setAmtMilk(5);
		r1.setAmtSugar(5);
		Assert.assertTrue(inventory.enoughIngredients(r1));
		
		r1.setAmtChocolate(5);
		r1.setAmtCoffee(5);
		r1.setAmtMilk(5);
		r1.setAmtSugar(5);
		
		r1.setAmtCoffee(50);
		Assert.assertFalse(inventory.enoughIngredients(r1));
		
		r1.setAmtChocolate(5);
		r1.setAmtCoffee(5);
		r1.setAmtMilk(5);
		r1.setAmtSugar(5);
		
		r1.setAmtChocolate(50);
		Assert.assertFalse(inventory.enoughIngredients(r1));
		
		r1.setAmtChocolate(5);
		r1.setAmtCoffee(5);
		r1.setAmtMilk(5);
		r1.setAmtSugar(5);
		
		r1.setAmtMilk(50);
		Assert.assertFalse(inventory.enoughIngredients(r1));
		
		r1.setAmtChocolate(5);
		r1.setAmtCoffee(5);
		r1.setAmtMilk(5);
		r1.setAmtSugar(5);
		
		r1.setAmtSugar(50);
		Assert.assertFalse(inventory.enoughIngredients(r1));
		
		r1.setAmtChocolate(50);
		r1.setAmtCoffee(50);
		r1.setAmtMilk(50);
		r1.setAmtSugar(50);
		
		Assert.assertFalse(inventory.enoughIngredients(r1));
	}
}
