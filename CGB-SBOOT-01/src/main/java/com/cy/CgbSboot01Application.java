package com.cy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @SpringBootApplication 注解一般用于修饰或描述
 * springboot项目的启动类,用于告诉底层系统:
 * 1)读取spring-boot-autoconfigure.jar包中的spring.factories
 * 2)对此启动类所在包以及子包中的类进行扫描,检测此类是否是一个
 *    由spring管理的对象.
 *
 */
@SpringBootApplication
public class CgbSboot01Application {

	public static void main(String[] args) {
		SpringApplication.run(CgbSboot01Application.class, args);
	}

}
