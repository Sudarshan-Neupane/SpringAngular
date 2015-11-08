package com.vastika.springAngular;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {
	@Test
	public void testAbc(){
		Calculator cal = new Calculator();
		int expected =2;
		int actual = cal.abs(-2);
		assertEquals(expected,actual);
		
	}

}
