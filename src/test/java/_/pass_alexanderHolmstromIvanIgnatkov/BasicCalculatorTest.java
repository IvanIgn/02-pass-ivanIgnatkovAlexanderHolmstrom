package _.pass_alexanderHolmstromIvanIgnatkov;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public class BasicCalculatorTest {

	BasicCalculator calc = new BasicCalculator();	
	Random rand = new Random();
	double numberOne = 0.0;
	double numberTwo = 0.0;
	double result = 0.0;
	
	
	@Test
	public void testBasicAdditionMethod() {
		
		
		for (int i = 0; i < 10; i++) {
			numberOne = rand.nextDouble()*10;
			System.out.println(numberOne);
			numberTwo = rand.nextDouble()*10;
			System.out.println(numberTwo);
			result = numberOne + numberTwo;
			System.out.println(result);
			
			assertEquals(calc.addition(numberOne, numberTwo), result, 0);
		}
		System.out.println(" ");
	}
	
	@Test
	public void testBasicSubtractionMethod() {
		
		
		for (int i = 0; i < 10; i++) {
			numberOne = rand.nextDouble()*10;
			System.out.println(numberOne);
			numberTwo = rand.nextDouble()*10;
			System.out.println(numberTwo);
			result = numberOne - numberTwo;
			System.out.println(result);
			
			assertEquals(calc.subtraction(numberOne, numberTwo), result, 0);
		}
		System.out.println(" ");
	}
	
	@Test
	public void testBasicMultiplicationMethod() {
		
		
		for (int i = 0; i < 10; i++) {
			numberOne = rand.nextDouble()*10;
			System.out.println(numberOne);
			numberTwo = rand.nextDouble()*10;
			System.out.println(numberTwo);
			result = numberOne * numberTwo;
			System.out.println(result);
			
			assertEquals(calc.multiplication(numberOne, numberTwo), result, 0);
		}
		System.out.println(" ");
	}
	
	@Test
	public void testBasicDivisionMethod() {
		
		
		for (int i = 0; i < 10; i++) {
			numberOne = rand.nextDouble()*10;
			System.out.println(numberOne);
			numberTwo = rand.nextDouble()*10;
			System.out.println(numberTwo);
			result = numberOne / numberTwo;
			System.out.println(result);
			
			assertEquals(calc.division(numberOne, numberTwo), result, 0);
		}
		System.out.println(" ");
	}
}
