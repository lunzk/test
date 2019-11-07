package com.cy.pj.goods.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.pj.goods.dao.GoodsDao;

@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsDao goodsDao;
	@Override
	public int deleteObjects(Integer... ids) {
		int rows = goodsDao.deleteObjects(ids);
		return rows;
	}
	
}
