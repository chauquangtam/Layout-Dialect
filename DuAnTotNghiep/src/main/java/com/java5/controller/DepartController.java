package com.java5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DepartController {
	@RequestMapping("/homeadmin")
	public String index() {
		return "departs/products";
	}
}
