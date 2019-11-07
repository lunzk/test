package com.cy.pj.goods.dao.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.goods.dao.GoodsDao;

@SpringBootTest
public class GoodsDaoTests {
	@Autowired
	private GoodsDao goodsDao;
	@Test
	public void testDeleteById() {
		int rows = goodsDao.deleteById(3);
		System.out.println("delete.rows="+rows);
	}
	@Test
	public void testDeleteObjects() {
		int rows = goodsDao.deleteObjects(10,20);
		System.out.println("deleteObjects.rows="+rows);
	}
}
