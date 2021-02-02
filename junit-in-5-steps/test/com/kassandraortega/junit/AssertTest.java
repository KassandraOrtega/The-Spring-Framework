package com.kassandraortega.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	public void test() {
		// assertEquals(1, 1);
		
		boolean condn = true;
		assertEquals(true, condn);
		assertTrue(condn);
		assertFalse(condn);
		// assertNotNull();
		// assertNull();
		// assertNotEquals();
		// assertArrayEquals(expected, actual);
	}
}