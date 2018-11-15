package com.LengthConvertor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LengthConvertorTest {


	Metre m=new Metre();
	Feet f=new Feet();
	Inch i=new Inch();
	
	@Test
	void testObject()
	{
		assertNotNull(m);
		assertNotNull(f);
		assertNotNull(i);
	}
	
	@Test
	void test() {
		
		assertEquals(0.254, m.convert1(10));
		assertEquals(32.8084, m.convert2(10));

		assertEquals(3.048, f.convert1(10));
		assertEquals(120, f.convert2(10));
		
		assertEquals(393.7, i.convert1(10));
		assertEquals(0.833, i.convert2(10));
	}

}
