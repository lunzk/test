package com.cy.pj.goods.dao.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.goods.service.GoodsService;

@SpringBootTest
public class GoodsServicesTests {
	@Autowired
	private GoodsService goodsService;
	@Test
	public void test() {
		int rows = goodsService.deleteObjects(9,10);
		System.out.println(rows);
	}
}
