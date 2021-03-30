package _.pass_alexanderHolmstromIvanIgnatkov;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public class MainTest {
	BasicCalculator basCalc = new BasicCalculator();
	AdvancedCalculator advCalc = new AdvancedCalculator();
	Main main = new Main();
	
	@Test
	public void testMainAdditionMethod() {
		
			assertEquals(basCalc.addition(1.0, 2.0), 3.0, 0);

	}
}
