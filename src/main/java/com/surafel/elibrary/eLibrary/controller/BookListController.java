package com.surafel.elibrary.eLibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class BookListController {
	
	@GetMapping(value = {"/elibrary/Book/list"})
	public String displayListpage()
	{
		return "index";
	}

}
