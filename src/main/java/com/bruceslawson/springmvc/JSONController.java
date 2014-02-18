package com.bruceslawson.springmvc;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bruceslawson.springmvc.model.BusinessService;
import com.bruceslawson.springmvc.model.SomeBean;
 
@Controller
public class JSONController {
	
	@RequestMapping(value="/getjson")
	public @ResponseBody SomeBean getSomeJson() {
		
		// do some business stuff and get data (model)
		BusinessService service = new BusinessService();
		SomeBean bean = service.getSomeBean();
		
		// return json
	    return bean;		
	}
	
	
	@RequestMapping(value="/getjson2")
	public @ResponseBody SomeBean getSomeJson(@RequestParam String name, @RequestParam Integer age) {
		
		// do some business stuff and get data (model)
		SomeBean bean = new SomeBean();
		bean.setName(name);
		bean.setAge(age);
		
		// return json
	    return bean;
	}
	
	
	@RequestMapping(value="/getjson3")
	public @ResponseBody List<SomeBean> getSomeJson2() {
		
		// do some business stuff and get data (model)
		BusinessService service = new BusinessService();
		List<SomeBean> beans = service.getSomeBeans();
		
		// return json
	    return beans;
	}
	
}