package com.java5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
}
