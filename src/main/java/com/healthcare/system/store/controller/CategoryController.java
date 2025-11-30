package com.healthcare.system.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicine")
public class CategoryController {

	@GetMapping("/categories")
	public String getProducts() {
//        System.out.println("Categories page...");
		return "Categories page...";
	}
}
