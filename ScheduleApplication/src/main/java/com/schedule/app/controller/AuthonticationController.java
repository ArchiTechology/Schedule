package com.schedule.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AuthonticationController {

	@GetMapping("/login")
	public ModelAndView Login() {
		return new ModelAndView("login");
	}

}
