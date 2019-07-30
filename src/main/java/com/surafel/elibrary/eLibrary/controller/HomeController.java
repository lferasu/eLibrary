package com.surafel.elibrary.eLibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value = "/elibrary")
	public String displayHomepage()
	{
		return "index";
	}
}
