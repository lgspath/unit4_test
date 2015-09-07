package unit4_test1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Unit_testTest {
	private static Unit_test unit4_test = new Unit_test();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFor() {
		unit4_test.For();
		assertEquals(unit4_test.Number(), unit4_test.getResult());
	}

}
