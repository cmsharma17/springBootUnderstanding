package com.cms.SpringBootJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
