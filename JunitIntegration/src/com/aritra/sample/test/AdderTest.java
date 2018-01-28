package com.aritra.sample.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.aritra.sample.Adder;

public class AdderTest {
	private Adder ad = null;
	
	@Before
	public void setAdder() {
		ad = new Adder();
	}

	@Test
	public void additionOfTwoIntegers() {
		
		//assert statements
		assertEquals("6 + 4 must be 10",10, ad.add(6, 4));
	}
	
	@Test
	public void additionOfTwoStrings() {
		
		//assert statements
		assertEquals("Aritra + Chatterjee must be AritraChatterjee", "AritraChatterjee",ad.addString("Aritra", "Chatterjee"));
	}
	
	@After
	public void unsetAdder() {
		ad = null;
	}
}
