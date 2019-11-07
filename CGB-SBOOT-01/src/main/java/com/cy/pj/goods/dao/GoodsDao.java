package com.cy.pj.goods.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/**
 * @Mapper 注解用于修饰数据层接口,
 * 目的告诉MyBatis框架,此接口的实现
 * 类由MyBatis框架创建,并且可以将实现类的对象交给
 * Spring容器管理,Spring容器存储此类对象时,默认
 * 会将类名(首字母小写)作为key进行存储.
 *
 */
@Mapper
public interface GoodsDao {
	@Delete("delete from tb_goods where id=#{id}")
	int deleteById(Integer id);
	/**
	 * 基于多个id执行记录删除操作
	 * @param ids 可变参数,其中...为JDK1.5新特性
	 * @return 删除的行数
	 * 当方法中的可变参数再SQL中进行 引用时,默认可以使用
	 * array这个变量接收参数值,也可以在方法参数定义时
	 * 使用@Param注解对方法参数进行修饰,然后在SQL中
	 * 使用@Param注解指定的名字获取参数值
	 */
	int deleteObjects(@Param("ids")Integer... ids);
}


