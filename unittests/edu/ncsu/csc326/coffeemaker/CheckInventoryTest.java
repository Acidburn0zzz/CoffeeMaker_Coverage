package edu.ncsu.csc326.coffeemaker;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CheckInventoryTest extends SetupTest {
	
	public void testAddInventory1(){
		cm.addInventory(10, 0, 10, 10);
	}

	public void testAddInventory2(){
		cm.addInventory(0, 10, 10, 10);
	}

	public void testAddInventory5(){
		cm.addInventory(-10, 10, 10, 10);
	}
	
	public void testAddInventory6(){
		cm.addInventory(10, -10, 10, 10);
	}
	
	public void testAddInventory7(){
		cm.addInventory(10, 10, -10, 10);
	}
	
	public void testAddInventory8(){
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

}
