package com.cy.pj.goods.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cy.pj.goods.service.GoodsService;

@Controller
@RequestMapping("/goods/")
public class GoodsController {
	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("doDeleteObjects")
	@ResponseBody
	public String doDeleteObjects(Integer...ids) {
		int rows = goodsService.deleteObjects(ids);
		return "delete ok,rows="+rows;
	}
	
	@RequestMapping("doGoodsUI")
	public String doGoodsUI() {
		return "goods";
		//这个视图名字会返回给DispatcherServlet
		//然后DispatcherServlet会调用视图解析器
		//视图解析器对名字进行解析,添加前缀后缀,并将结果返回给DispatcherServlet
		//DispatcherServlet将view(/templates/pages/goods.html)响应到客户端
	}
}
