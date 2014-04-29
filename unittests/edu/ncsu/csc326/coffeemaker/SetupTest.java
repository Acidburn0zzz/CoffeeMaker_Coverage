package edu.ncsu.csc326.coffeemaker;

import junit.framework.TestCase;

public abstract class SetupTest extends TestCase {

	public CoffeeMaker cm;
	public Recipe r1;
	public Recipe r2;
	public Recipe r3;
	public Recipe r4;
	public Recipe r5;

	public void setUp() throws Exception {
		cm = new CoffeeMaker();

		// Set up for r1
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setAmtChocolate(0);
		r1.setAmtCoffee(3);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setPrice(50);

		// Set up for r2
		r2 = new Recipe();
		r2.setName("Mocha");
		r2.setAmtChocolate(20);
		r2.setAmtCoffee(3);
		r2.setAmtMilk(1);
		r2.setAmtSugar(1);
		r2.setPrice(75);

		// Set up for r3
		r3 = new Recipe();
		r3.setName("Latte");
		r3.setAmtChocolate(0);
		r3.setAmtCoffee(3);
		r3.setAmtMilk(3);
		r3.setAmtSugar(1);
		r3.setPrice(100);

		// Set up for r4
		r4 = new Recipe();
		r4.setName("Hot Chocolate");
		r4.setAmtChocolate(4);
		r4.setAmtCoffee(0);
		r4.setAmtMilk(1);
		r4.setAmtSugar(1);
		r4.setPrice(65);

		r5 = new Recipe();
		r5.setName("Hot Chocolate2");
		r5.setAmtChocolate(4);
		r5.setAmtCoffee(0);
		r5.setAmtMilk(1);
		r5.setAmtSugar(1);
		r5.setPrice(65);
	}

}