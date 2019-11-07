package com.cy.pj.datasources;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DataSourcesTests {
	@Autowired
	private DataSource dataSource;
	@Test
	public void test() throws Exception {
		System.out.println(dataSource.getConnection());
	}
}
