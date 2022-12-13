package com.martaCode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.martaCode.model.Persona;
import com.martaCode.repo.IPersonaRepo;

@Controller
public class DemoController {
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue = "World") String name, Model model) {
//		if (name==null||name.isEmpty()) {
//			name="MartaCode";
//		}
		if(name.endsWith("World")) {
			repo.delete(new Persona(2, "Word"));
			name="MartaCode";
		}
		
		Persona per = new Persona(0, name);
		repo.save(per);
		
		model.addAttribute("name", name);
		return "greeting";
	}
}
