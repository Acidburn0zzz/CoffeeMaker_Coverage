package edu.ncsu.csc326.coffeemaker;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CheckInventoryTest extends SetupTest {

	private CoffeeMaker cm;
	private Recipe r1;
	private Recipe r2;
	private Recipe r3;
	private Recipe r4;

	// Prompt for each


	public void testInventory(){
		r1.setAmtChocolate(9999);

		cm.addRecipe(r1);

		Assert.assertSame(1000, cm.makeCoffee(r1, 1000));
	}

	public void testAddInventory1(){
		cm.addInventory(10, 0, 10, 10);
	}

	public void testAddInventory2(){
		cm.addInventory(0, 10, 10, 10);
	}

	public void TestAddInventory5(){
		cm.addInventory(-10, 10, 10, 10);
	}
	
	public void TestAddInventory6(){
		cm.addInventory(10, -10, 10, 10);
	}
	
	public void TestAddInventory7(){
		cm.addInventory(10, 10, -10, 10);
	}
	
	public void TestAddInventory8(){
		cm.addInventory(10, 10, 10, -10);
	}

	public void testCheckGetter() {
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


	public void testSet() {
		Inventory inventory = new Inventory();

		int test = inventory.getChocolate();
		inventory.setChocolate(-1);

		Assert.assertSame(test, inventory.getChocolate());
	}


	public void testSet2() {
		Inventory inventory = new Inventory();

		int test = inventory.getCoffee();
		inventory.setCoffee(-1);

		Assert.assertSame(test, inventory.getCoffee());
	}

	public void testSet3() {
		Inventory inventory = new Inventory();

		int test = inventory.getMilk();
		inventory.setMilk(-1);

		Assert.assertSame(test, inventory.getMilk());
	}


	public void testSet4() {
		Inventory inventory = new Inventory();

		int test = inventory.getSugar();
		inventory.setSugar(-1);

		Assert.assertSame(test, inventory.getSugar());
	}

}
