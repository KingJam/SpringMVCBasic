package com.bruceslawson.springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/welcome")
public class HelloController {
 
	@RequestMapping(value="/hi", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
 
		model.addAttribute("message", "printWelcome");
		
		return "hello";
	}
 
	
	@RequestMapping(value="/hi2")
	public String printWelcome2(ModelMap model) {
 
		model.addAttribute("message", "printWelcome2");
		
		return "hello";
	}
}