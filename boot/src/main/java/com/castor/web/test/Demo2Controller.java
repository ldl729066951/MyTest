package com.castor.web.test;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.castor.web.bean.Demo;
import com.castor.web.test.service.DemoService;

@RestController
@RequestMapping("/demo2")
public class Demo2Controller {

	@Resource
	private DemoService demoService;
	
	@RequestMapping("/save")
	public String save(){
		Demo de = new Demo();
		de.setName("Angel");
		demoService.save(de);
		return "ok.save";
	}
	
}
