package com.cy.cache.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.cy.pj.common.cache.Cache;
/**
 * @SpringBootTest 注解描述的类为一个单元测试类,
  *   此类型的对象可以交给Spring容器管理.
 *
 */
@SpringBootTest
public class CacheTests {
	//has a(耦合)
	/**
	  * 此类为我们自己写的一个Bean对象
	 */
	//@Autowired
	//private DefaultCache defaultCache;
	@Autowired
	private Cache defaultCache;
	/**Spring中的核心Context对象*/
	@Autowired
	private ApplicationContext ctx;
	//ClassPathXmlApplicationContext
	//AnnotationConfigApplicationContext
	@Test
	public void ctx() {
		System.out.println(ctx);
	}
	@Test
	public void testDeafultCache() {
		System.out.println(defaultCache);
		Object obj = ctx.getBean("defaultCache");
		System.out.println(defaultCache==obj);
	}
}
