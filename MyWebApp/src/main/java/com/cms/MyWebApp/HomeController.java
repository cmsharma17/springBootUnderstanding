package com.cms.MyWebApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home() {
		System.out.println("Home Controller");
		return "home"; 
	}
	
	@RequestMapping("login")
	public String exampleWithRequestAndResponse(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		System.out.println("name ::"+name);
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		return "login";
	}
	
	@RequestMapping("view")
	public String example(@RequestParam("name") String myName, HttpSession session) {
		
		System.out.println("name ::"+myName);
		session.setAttribute("name", myName);
		return "view";
	}
	
	@RequestMapping("newPage")
	public ModelAndView newPage(@RequestParam("name") String myName ) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName);
		mv.setViewName("newPage");
		
		return mv;
	}
}
