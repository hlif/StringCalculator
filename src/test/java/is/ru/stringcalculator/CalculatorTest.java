package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmpty() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOne() {
		assertEquals(1, Calculator.add("1"));
	}


	@Test
	public void testTwo() {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
    public void testManyeNumbers(){
    	assertEquals(6, Calculator.add("1,2,3"));
    }

    @Test
    public void testUnknownNumbers() {
        assertEquals(3+6+15+18+46+33, Calculator.add("3,6,15,18,46,33"));
    }


    @Test
    public void testNewLines() {
        assertEquals(6, Calculator.add("1\n2,3"));
    }

        @Test
	public final void testNeg() {
		Exception exception = null;
		try {
			Calculator.add("-1,2");
		} catch (Exception e) {
			exception = e;
		}
	}



	@Test
	public final void testManyNeg() {
		Exception exception = null;
		try {
			Calculator.add("3,-5,6,-9");
		} catch (Exception e) {
			exception = e;
		}
	}


}