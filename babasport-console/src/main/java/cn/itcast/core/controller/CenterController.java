package cn.itcast.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.core.bean.TestTb;
import cn.itcast.core.service.TestTbService;


/**
 * 后台管理
 * @author lx
 *
 */
@Controller
public class CenterController {

	@Autowired
	private TestTbService testTbService;
	
	//入口
	/**
	 * ModelAndView  : 跳转视图+数据     不用
	 * void  : 异步时 ajax    
	 * String  : 跳转视图      +  Model
	 */
	@RequestMapping(value = "/test/index.do")
	public String index(Model model){
		TestTb testTb = new TestTb();
		testTb.setId(1);
		testTb.setName("范冰冰10");
		testTbService.insertTestTb(testTb);
		return "index";
	}
	
	
}
