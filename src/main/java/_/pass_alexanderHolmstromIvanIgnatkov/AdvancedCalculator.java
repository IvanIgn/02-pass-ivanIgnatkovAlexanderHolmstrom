package _.pass_alexanderHolmstromIvanIgnatkov;
import java.lang.Math;

public class AdvancedCalculator extends BasicCalculator implements AdvancedCalculatorInterface {

	@Override
	public double addition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

	@Override
	public double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	@Override
	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber ;
	}

	@Override
	public double division(double firstNumber, double secondNumber) {
		return firstNumber / secondNumber;
	}

	@Override
	public double squareroot(double number) {
		return Math.sqrt(number);
	}

	@Override
	public double raisedToThePowerOf(double base, double exponent) {
		return Math.pow(base, exponent);
	}

	@Override
	public double absoluteValue(double number) {
		return Math.abs(number);
	}

	@Override
	public double square(double number) {
		return number * number;
	}

	@Override
	public double cube(double number) {
		return number * number * number;
	}

}
