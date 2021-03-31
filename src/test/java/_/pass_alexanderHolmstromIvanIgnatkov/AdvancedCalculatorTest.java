package _.pass_alexanderHolmstromIvanIgnatkov;

import static org.junit.Assert.assertEquals;
import java.text.DecimalFormat;

import java.util.Random;

import org.junit.Test;


public class AdvancedCalculatorTest {
	AdvancedCalculator calc = new AdvancedCalculator();	
	Random rand = new Random();
	double numberOne = 0.0;
	double numberTwo = 0.0;
	double result = 0.0;
    static DecimalFormat df2 = new DecimalFormat("#.##");
    int min = -10; 
    int max = 10;
	/*
	@Test
	public void testAdditionMethod() {
		
		System.out.println("Addition: ");
		for (int i = 0; i < 10; i++) {
			numberOne = -10 + rand.nextDouble()*10;
			System.out.println(numberOne);
			numberTwo = -10 + rand.nextDouble()*10;
			System.out.println(numberTwo);
			result = numberOne + numberTwo;
			System.out.println(result);
			
			assertEquals(calc.addition(numberOne, numberTwo), result, 0);
		}
		System.out.println();
	}
	
	@Test
	public void testSubtractionMethod() {
		
		System.out.println("Subtraction: ");
		for (int i = 0; i < 10; i++) {
			numberOne = rand.nextDouble()*10;
			System.out.println(numberOne);
			numberTwo = rand.nextDouble()*10;
			System.out.println(numberTwo);
			result = numberOne - numberTwo;
			System.out.println(result);
			
			assertEquals(calc.subtraction(numberOne, numberTwo), result, 0);
		}
		System.out.println();
	}
	
	@Test
	public void testMultiplicationMethod() {
		System.out.println("Multiplication: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = rand.nextDouble()*10;
			System.out.println(numberOne);
			numberTwo = rand.nextDouble()*10;
			System.out.println(numberTwo);
			result = numberOne * numberTwo;
			System.out.println(result);
			
			assertEquals(calc.multiplication(numberOne, numberTwo), result, 0);
		}
		System.out.println();
	}
	
	@Test
	public void testDivisionMethod() {
		
		System.out.println("Division: ");
		for (int i = 0; i < 10; i++) {
			numberOne = rand.nextDouble()*10;
			System.out.println(numberOne);
			numberTwo = rand.nextDouble()*10;
			System.out.println(numberTwo);
			result = numberOne / numberTwo;
			System.out.println(result);
			
			assertEquals(calc.division(numberOne, numberTwo), result, 0);
		}
		System.out.println();
	}
	*/
	@Test
	public void testSquarerootMethod() {
		System.out.println("Squareroot: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne =  (-0.5 + rand.nextDouble()*10);
			//System.out.println(numberOne);
			
	
			result = Math.sqrt(numberOne);
			System.out.println(df2.format(result));
			
			assertEquals(calc.squareroot(numberOne), result, 0);
		}
		System.out.println(" ");
	}
	
	@Test
	public void testRaisedToThePowerOfMethod() {
		
		System.out.println("RaisedToThePowerOf: ");
		for (int i = 0; i < 10; i++) {
			numberOne = (-0.5 + rand.nextDouble()*10);
			//System.out.println(numberOne);
			numberTwo = (-0.5 + rand.nextDouble()*10);
			//System.out.println(numberTwo);
			result = Math.pow(numberOne, numberTwo);
			System.out.println(df2.format(result));
			
			assertEquals(calc.raisedToThePowerOf(numberOne, numberTwo), result, 0);
		}
		System.out.println(" ");
	}
	
	@Test
	public void testAbsoluteValueMethod() {
		System.out.println("Absolute: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne =  ((rand.nextDouble() * (max - min)) + min);
			//System.out.println(numberOne);
			
	
			result = Math.abs(numberOne);
			System.out.println(df2.format(result));
			
			assertEquals(calc.absoluteValue(numberOne), result, 0);
		}
		System.out.println(" ");
	}
	
	@Test
	public void testSquareMethod() {
		System.out.println("Square: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne =  ((rand.nextDouble() * (max - min)) + min);
			//System.out.println(numberOne);
			
	
			result = Math.pow(numberOne, 2);
			System.out.println(df2.format(result));
			
			assertEquals(calc.square(numberOne), result, 0);
		}
		System.out.println(" ");
	}
	
	@Test
	public void testCubeMethod() {
		
		System.out.println("Cube: ");
		for (int i = 0; i < 10; i++) {
			numberOne =  ((rand.nextDouble() * (max - min)) + min);
			//System.out.println(numberOne);
			
	
			result = Math.pow(numberOne, 3);
			System.out.println(df2.format(result));
			
			assertEquals(calc.cube(numberOne), result, 0);
		}
		System.out.println(" ");
	}
	
	
	
}
