package com.cy.pj.goods.pojo.test;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.goods.pojo.Goods;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class GoodsTests {
	//private static Logger log=LoggerFactory.getLogger(GoodsTests.class);
	@Test
	public void testGoods01() {
		Goods g = new Goods();
		g.setId(100L);
		g.setName("spring boot");
		g.setRemark("autoconfiguration");
		g.setCreatedTime(new Date());
		//System.out.println(g);
		log.info(g.toString());
	}
	@Test
	public void testGoods02() {
		Goods g=new Goods(200L,"lombok","lmbok...",new Date());
		log.info(g.toString());
	}
	@Test
	public void testGoods03() {
		Goods g=new Goods().setId(300L).setName("mybatis").setRemark("mybatis...").setCreatedTime(new Date());
		log.info(g.toString());
	}
}
