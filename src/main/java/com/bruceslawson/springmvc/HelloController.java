package com.bruceslawson.springmvc;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bruceslawson.springmvc.model.SomeBean;
import com.bruceslawson.springmvc.model.BusinessService;
 
@Controller
//@RequestMapping("/welcome")
public class HelloController {
 
	@RequestMapping(value="/hi", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
 
		// set dome data (model)
		model.addAttribute("message", "Welcome to Spring MVC");
		
		// Define the view
		return "hello";
	}
	
	@RequestMapping(value="/hi2")
	public String printWelcome2(ModelMap model) {
 
		// set some data (model)
		model.addAttribute("message", "Hello again");
		
		// define the view
		return "hello";
	}
	
	
	@RequestMapping(value="/hi3")
	public ModelAndView printWelcome3() {
 
		// Set the data and define the view
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("message", "Hello again 3");
		
		return mv;
	}
	
	
	@RequestMapping(value="/hi4")
	public ModelAndView printWelcome4() {
		
		// Do some business (model) stuff 
		BusinessService service = new BusinessService();
		SomeBean bean = service.getSomeBean();
		
		// Set the data and define the view
		ModelAndView mv = new ModelAndView("hello2");
		mv.addObject("someBean", bean);
		
		// Return model and view
		return mv;
	}
	
	
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
		BusinessService service = new BusinessService();
		SomeBean bean = service.getSomeBean();
		bean.setName(name);
		bean.setAge(age);
		
		System.out.println("name: " + bean.getName());
		System.out.println("age: " + bean.getAge());
		
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