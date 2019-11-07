package com.cy.pj.goods.pojo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Goods {//lombok会在编译阶段为类中属性添加相关方法
	private Long id;
	private String name;
	private String remark;
	private Date createdTime;
	

}
