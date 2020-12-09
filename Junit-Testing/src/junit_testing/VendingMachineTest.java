package junit_testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {

	private static VendingMachine vd = new VendingMachine();

	@Test
	public void cokeIpGtCost() {
		String op1 = vd.dispenseItem(30, "coke");
		String expected_op1 = "Item dispensed and change of 5 returned";
		assertEquals(op1, expected_op1);
	}
	
	@Test
	public void candyIpEqCost() {
		String op2 = vd.dispenseItem(20, "candy");
		String expected_op2 = "Item dispensed.";
		assertEquals(op2, expected_op2);
	}
	
//	@Test
//	public void candyIpLtCost1() {
//		String op3 = vd.dispenseItem(25, "candy");
//		String expected_op3 = "Item dispensed and change of 5 returned";
//		assertEquals(op3, expected_op3);
//	}
	
	@Test
	public void coffeeIpLtCost1() {
		String op3 = vd.dispenseItem(35, "coffee");
		String expected_op3 = "Item not dispensed, missing 10 cents. Can purchase candy or coke.";
		assertEquals(op3, expected_op3);
	}
	
	@Test
	public void coffeeIpLtCost2() {
		String op4 = vd.dispenseItem(20, "coffee");
		String expected_op4 = "Item not dispensed, missing 25 cents. Can purchase candy.";
		assertEquals(op4, expected_op4);
	}
	
	@Test
	public void coffeeIpLtCost3() {
		String op5 = vd.dispenseItem(10, "coffee");
		String expected_op5 = "Item not dispensed, missing 35 cents. Cannot purchase item.";
		assertEquals(op5, expected_op5);
	}

}
