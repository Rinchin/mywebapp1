package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	
	//need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//a new controller method to read form data and
	//add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		//read the request parameter from the HMTL form
		String theName = request.getParameter("studentName");
	
		//convert the data to all caps
		theName = theName.toUpperCase();
	
		//create the message
		String theMessage = "Yo, "+theName;

		//add the message to the model
		model.addAttribute("message", theMessage);
		
		return "helloworld";
	}
}
