import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathUtilsTest {
	@Test
    public void testAdd() {
    	assertEquals(5, MathUtils.add(2, 3));
    	assertEquals(-1, MathUtils.add(7, -8));
    	assertEquals(0, MathUtils.add(0, 0));
    	
    }
	@Test
    public void testSubtract() {
    	assertEquals(5, MathUtils.subtract(7, 2));
    	assertEquals(-1, MathUtils.subtract(6, 7));
    	assertEquals(0, MathUtils.subtract(2, 2));
    	
    }
}

