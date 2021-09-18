package com.app1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UtilsTest {

	@Test
	void testAdd() {
		Utils ut =new Utils();
		Assertions.assertEquals( 6 , ut.add(2, 4));
	}

}
