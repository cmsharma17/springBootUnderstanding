package com.cms.SpringBootJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cms.SpringBootJPA.dao.AlienDao;
import com.cms.SpringBootJPA.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienDao repo;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Alien Controlle..");
		return "home";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {//@RequestParam FETCH THE VALUE FROM TEH CLIENT
		System.out.print("Get alien--"+aid);
		ModelAndView mv = new ModelAndView("showAlien");
		Alien alien = repo.findById(aid).orElse(new Alien());
		System.out.println(repo.findByTech("Java"));
		
		System.out.println(repo.findByAidGreaterThan(3));
		
		System.out.println(repo.findByTechSorted("Java"));
		mv.addObject(alien);
		return mv;
	}
}
