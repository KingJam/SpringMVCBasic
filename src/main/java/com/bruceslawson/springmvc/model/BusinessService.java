package com.bruceslawson.springmvc.model;

import java.util.ArrayList;
import java.util.List;

public class BusinessService {

	public SomeBean getSomeBean() {
		
		SomeBean someBean = new SomeBean();
		someBean.setName("Robert");
		someBean.setAge(25);
		
		return someBean;
	}

	
	public List<SomeBean> getSomeBeans() {
		List<SomeBean> beans = new ArrayList<SomeBean>();
		
		
		SomeBean someBean = new SomeBean();
		someBean.setName("Carly");
		someBean.setAge(10);
		
		beans.add(someBean);
		
		someBean = new SomeBean();
		someBean.setName("Laura");
		someBean.setAge(18);
		
		beans.add(someBean);

		someBean = new SomeBean();
		someBean.setName("Lenny");
		someBean.setAge(7);
		
		beans.add(someBean);		
		
		
		return beans;
	}

	
}
