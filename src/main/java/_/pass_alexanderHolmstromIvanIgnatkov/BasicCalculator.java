package _.pass_alexanderHolmstromIvanIgnatkov;

public class BasicCalculator implements BasicCalculatorInterface {

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


}
