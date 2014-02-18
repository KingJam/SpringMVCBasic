package com.bruceslawson.springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bruceslawson.springmvc.model.BusinessService;
import com.bruceslawson.springmvc.model.SomeBean;
 
@Controller
public class SimpleController {
	
	@RequestMapping(value="/welcome")
	public String printWelcome(ModelMap model) {
 
		// set dome data (model)
		model.addAttribute("message", "Welcome to Spring MVC");
		model.addAttribute("springVersion", "3.2.6");
		
		// Define the view
		return "hello";
	}
	
	
	@RequestMapping(value="/welcome2")
	public ModelAndView printWelcome3() {
 
		// Set the data and define the view
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("message", "Returning a ModelAndView object this time.");
		mv.addObject("springVersion", "3.2.6");
		
		return mv;
	}
	
	
	@RequestMapping(value="/welcome3")
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
	
}