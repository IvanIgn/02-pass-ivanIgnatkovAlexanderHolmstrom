package _.pass_alexanderHolmstromIvanIgnatkov;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;


public class AdvancedCalculatorTest {
	AdvancedCalculator calc = new AdvancedCalculator();	
	Random rand = new Random();
	double numberOne = 0.0;
	double numberTwo = 0.0;
	double result = 0.0;
	
	
	@Test
	public void testAdditionMethod() {
		
		
		for (int i = 0; i < 10; i++) {
			numberOne = rand.nextDouble()*10;
			System.out.println(numberOne);
			numberTwo = rand.nextDouble()*10;
			System.out.println(numberTwo);
			result = numberOne + numberTwo;
			System.out.println(result);
			
			assertEquals(calc.addition(numberOne, numberTwo), result, 0);
		}
	}
	
	@Test
	public void testSubtractionMethod() {
		
		
		for (int i = 0; i < 10; i++) {
			numberOne = rand.nextDouble()*10;
			System.out.println(numberOne);
			numberTwo = rand.nextDouble()*10;
			System.out.println(numberTwo);
			result = numberOne - numberTwo;
			System.out.println(result);
			
			assertEquals(calc.subtraction(numberOne, numberTwo), result, 0);
		}
	}
	
	@Test
	public void testMultiplicationMethod() {
		
		
		for (int i = 0; i < 10; i++) {
			numberOne = rand.nextDouble()*10;
			System.out.println(numberOne);
			numberTwo = rand.nextDouble()*10;
			System.out.println(numberTwo);
			result = numberOne * numberTwo;
			System.out.println(result);
			
			assertEquals(calc.multiplication(numberOne, numberTwo), result, 0);
		}
	}
	
	@Test
	public void testDivisionMethod() {
		
		
		for (int i = 0; i < 10; i++) {
			numberOne = rand.nextDouble()*10;
			System.out.println(numberOne);
			numberTwo = rand.nextDouble()*10;
			System.out.println(numberTwo);
			result = numberOne / numberTwo;
			System.out.println(result);
			
			assertEquals(calc.division(numberOne, numberTwo), result, 0);
		}
	}
	
	@Test
	public void testSquarerootMethod() {
		
		
		for (int i = 0; i < 10; i++) {
			numberOne = rand.nextDouble()*10;
			System.out.println(numberOne);
			
	
			result = Math.sqrt(numberOne);
			System.out.println(result);
			
			assertEquals(calc.squareroot(numberOne), result, 0);
		}
	}
	
	@Test
	public void testRaisedToThePowerOfMethod() {
		
	
		for (int i = 0; i < 10; i++) {
			numberOne = rand.nextDouble()*10;
			System.out.println(numberOne);
			numberTwo = rand.nextDouble()*10;
			System.out.println(numberTwo);
			result = Math.pow(numberOne, numberTwo);
			System.out.println(result);
			
			assertEquals(calc.raisedToThePowerOf(numberOne, numberTwo), result, 0);
		}
	}
	
	@Test
	public void testAbsoluteValueMethod() {
		
		
		for (int i = 0; i < 10; i++) {
			numberOne = rand.nextDouble()*10;
			System.out.println(numberOne);
			
	
			result = Math.abs(numberOne);
			System.out.println(result);
			
			assertEquals(calc.absoluteValue(numberOne), result, 0);
		}
	}
	
	@Test
	public void testSquareMethod() {
		
		
		for (int i = 0; i < 10; i++) {
			numberOne = rand.nextDouble()*10;
			System.out.println(numberOne);
			
	
			result = Math.pow(numberOne, 2);
			System.out.println(result);
			
			assertEquals(calc.square(numberOne), result, 0);
		}
	}
	
	@Test
	public void testCubeMethod() {
		
		
		for (int i = 0; i < 10; i++) {
			numberOne = rand.nextDouble()*10;
			System.out.println(numberOne);
			
	
			result = Math.pow(numberOne, 3);
			System.out.println(result);
			
			assertEquals(calc.cube(numberOne), result, 0);
		}
	}
	
	
	
}
