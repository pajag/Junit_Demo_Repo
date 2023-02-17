package com.example.junit.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SecondJUnitApplicationTests {

	@Test
	void test() {
		assertTrue(true);
	}

}
