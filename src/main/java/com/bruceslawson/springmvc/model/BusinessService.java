package com.bruceslawson.springmvc.model;

public class BusinessService {

	public SomeBean getSomeBean() {
		
		SomeBean model = new SomeBean();
		model.setName("Bruce");
		model.setAge(100);
		
		return model;
	}
	
}
