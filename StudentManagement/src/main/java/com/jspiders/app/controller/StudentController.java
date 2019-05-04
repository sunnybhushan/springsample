package com.jspiders.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController 
{
	@RequestMapping(value="/")
	String sayHello(ModelMap m)
	{
		m.addAttribute("ab", "Hello Jspider");
		return "hello";
	}
	
	
}
