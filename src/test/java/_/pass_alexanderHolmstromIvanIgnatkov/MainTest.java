package _.pass_alexanderHolmstromIvanIgnatkov;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

public class MainTest {
	BasicCalculator basCalc = new BasicCalculator();
	AdvancedCalculator advCalc = new AdvancedCalculator();
	Main main = new Main();
	
	
	
	  @Test
	    public void testMainMethod() {
	        Main.main(null);
	    }
}
