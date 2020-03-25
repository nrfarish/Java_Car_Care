package finalProject;
import static org.junit.Assert.*;

import org.junit.Test;

public class carCareTest {

	@Test
	public void testMpg() {
		
		int a = 40400;
		int b = 40000;
		double c = 10;
		
		double expected = 40;
		double result = carCare.mpg(a, b, c);
		
		assertEquals(expected, result, 0.000001);
	}

}
