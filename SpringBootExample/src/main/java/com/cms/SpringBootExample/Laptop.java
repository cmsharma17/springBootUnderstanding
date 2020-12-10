package com.cms.SpringBootExample;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	private int lid;
	private String name;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", name=" + name + "]";
	}
	
	public void compile() {
		System.out.println("Compile Laptop");
	}
}
