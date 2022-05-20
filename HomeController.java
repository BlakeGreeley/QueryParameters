package com.codingdojo.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false) String searchQuery) {
		if(searchQuery == null ) {
			return "You searched for: Nothing";
		}
		else {
			return "You searched for:" + searchQuery;
		}
	}
}
