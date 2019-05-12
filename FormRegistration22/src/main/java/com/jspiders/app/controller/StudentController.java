package com.jspiders.app.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jspider.app.StudentDto;

@Controller
public class StudentController 
{
	
	@RequestMapping(value="/student")
	String Registration(@ModelAttribute StudentDto student, Model m)
	{
		m.addAttribute("std",student);
		//System.out.println(student);
		return "registrationOne";
	}

	
	/*
	 * @RequestMapping(value="/student",method=RequestMethod.POST) String
	 * dummy(StudentDto student,ModelMap m) { System.out.println(student);
	 * 
	 * 
	 * m.addAttribute("reg", "SignUp successfully"); m.addAttribute("rega",
	 * student); return "registrationOne";
	 * 
	 * }
	 */
	
}
