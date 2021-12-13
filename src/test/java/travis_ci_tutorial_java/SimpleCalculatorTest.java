package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
/*	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}*/
	
	/*public void testminus() {
		SimpleCalculator min = new SimpleCalculator();
		assertEquals(min.minus(1, 1), 2);	
	}*/
	
	/*public void testmultiply() {
	SimpleCalculator multi =new SimpleCalculator();
	assertEquals(multi.multiply(1, 1), 1);	
    }*/
	
	public void testDivide() {
		SimpleCalculator divi =new SimpleCalculator();
		divi.divide(2,2);	
	    }
	
}

