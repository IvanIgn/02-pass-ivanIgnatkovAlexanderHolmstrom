package _.pass_alexanderHolmstromIvanIgnatkov;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;
import java.util.Random;

import org.junit.Test;

public class BasicCalculatorTest {

	BasicCalculator calc = new BasicCalculator();	
	Random rand = new Random();
	double numberOne = 0.0;
	double numberTwo = 0.0;
	double result = 0.0;
	static DecimalFormat df2 = new DecimalFormat("#.##");
	
	
	@Test
	public void testBasicAdditionMethod() {
		System.out.println("Addition: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = -10 + rand.nextDouble()*10;
			//System.out.println(numberOne);
			numberTwo = -10 + rand.nextDouble()*10;
			//System.out.println(numberTwo);
			result = numberOne + numberTwo;
			System.out.println(df2.format(result));
			
			assertEquals(calc.addition(numberOne, numberTwo), result, 0);
		}
		System.out.println(" ");
	}
	
	@Test
	public void testBasicSubtractionMethod() {
		System.out.println("Subtraction: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = -10 + rand.nextDouble()*10;
			//System.out.println(numberOne);
			numberTwo = -10 + rand.nextDouble()*10;
			//System.out.println(numberTwo);
			result = numberOne - numberTwo;
			System.out.println(df2.format(result));
			
			assertEquals(calc.subtraction(numberOne, numberTwo), result, 0);
		}
		System.out.println(" ");
	}
	
	@Test
	public void testBasicMultiplicationMethod() {
		System.out.println("Multiplication: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = -10 + rand.nextDouble()*10;
			//System.out.println(numberOne);
			numberTwo = -10 + rand.nextDouble()*10;
			//System.out.println(numberTwo);
			result = numberOne * numberTwo;
			System.out.println(df2.format(result));
			
			assertEquals(calc.multiplication(numberOne, numberTwo), result, 0);
		}
		System.out.println(" ");
	}
	
	@Test
	public void testBasicDivisionMethod() {
		System.out.println("Division: ");
		
		for (int i = 0; i < 10; i++) {
			numberOne = -10 + rand.nextDouble()*10;
			//System.out.println(numberOne);
			numberTwo = -10 + rand.nextDouble()*10;
			//System.out.println(numberTwo);
			result = numberOne / numberTwo;
			System.out.println(df2.format(result));
			
			assertEquals(calc.division(numberOne, numberTwo), result, 0);
		}
		System.out.println(" ");
	}
}
