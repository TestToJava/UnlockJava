package com.unlockjava.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PagesController {

	@RequestMapping("/home")
	public String getIndexPage(Model model, @RequestParam(name = "name", defaultValue = "dibya") String name) {
		model.addAttribute("name", name);
		return "home";
	}

}
