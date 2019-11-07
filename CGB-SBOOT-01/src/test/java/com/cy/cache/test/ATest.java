package com.cy.cache.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.common.cache.A;

@SpringBootTest
public class ATest {
	@Autowired
	private A a;
	@Test
	public void test() {
		System.out.println(a);
	}
}
