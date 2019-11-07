package com.cy.pj.common.cache;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**
 * Spring是一个资源(对象)整合框架
 * @Component 注解对类进行描述时表示此类
 *    的对象由Spring框架创建,并由spring管理.
 * @Scope 注解用于告诉spring框架此类型的对象
  *  存储到什么作用域中(不同作用域会对应不同的存储方式).
  *  对于非web项目,bean对象的作用域一般只有两个:
  *  1)singleton  表示此类的实例在整个内存中只有一份(默认)
  *  2)prototype  表示此类的实例每次请求都会创建一个新的实例
 */
@Lazy
@Scope("prototype")//prototype(表示每次请求都会创建新的实例)
@Component
public class DefaultCache implements Cache{
	public DefaultCache() {
		System.out.println("DefaultCache()");
	}
	/**@PostConstruct 注解用于描述对象初始化方法,
	 * 在对象初始化时,可以执行此方法*/
	@PostConstruct
	public void init() {
		System.out.println("init()");
	}
	/**@PreDestroy 注解用于描述对象销毁方法
	 * 在对象销毁之前,可以让容器调用此方法,
	 * 以完成资源释放操作.*/
	@PreDestroy
	public void destroy() {
		System.out.println("destroy()");
	}
}
