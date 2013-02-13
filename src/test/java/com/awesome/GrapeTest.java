package com.awesome;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GrapeTest {

	@Test
	public void testDefaultGrape() {
		Grape testGrape = new Grape();

		assertFalse(testGrape.isWrangled());
	}

	@Test
	public void testConstructorGrape() {
		Grape testGrape = new Grape(true);

		assertTrue(testGrape.isWrangled());
	}	

	@Test
	public void testWrangleGrape() {
		Grape testGrape = new Grape(false);

		assertFalse(testGrape.isWrangled());

		testGrape.wrangle();

		assertTrue(testGrape.isWrangled());
	}	

	@Test
	public void testUnwrangleGrape() {
		Grape testGrape = new Grape(true);

		assertTrue(testGrape.isWrangled());

		testGrape.unwrangle();

		assertFalse(testGrape.isWrangled());
	}	
}