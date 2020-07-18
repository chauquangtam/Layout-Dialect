package com.java5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LayoutController {
	@RequestMapping("/")
	public String show() {
		return "contact";
	}
	@RequestMapping("/product")
	public String product() {
		return "products";
	}
}
