package com.caps.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.beans.Person;

@Controller
@RequestMapping("/param")
public class HandlingPrarmeters {
	
	@RequestMapping(value = "/form",method = RequestMethod.GET)
	public String getForm(){
		return "Form";
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping(value="/query",method=RequestMethod.GET)
	public String getQueryString(
			@RequestParam("name") String name,
			@RequestParam("age") int age
			){
		
		System.out.println(name);
		System.out.println(age);
		
		return "Msg";
	}
	
	
	
	
	@RequestMapping(value="/submit",method=RequestMethod.POST)
	public String getFormData(@RequestParam("id") int id,
			@RequestParam("name") String name,
			@RequestParam("age") int age, Model model){
		
		Person p = new Person();
		p.setAg(age);
		p.setIds(id);
		p.setNm(name);
		System.out.println(p.getIds());
		System.out.println(p.getNm());
		System.out.println(p.getAg());
		
		model.addAttribute("person", p);
		
		return "Person";
	}
	
	
	@RequestMapping(value="/path/{name}/{age}")
	public String getPathVariable(
			@PathVariable("name") String name,
			@PathVariable("age") String age
			){
		System.out.println(name);
		System.out.println(age);
		return "Msg";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
