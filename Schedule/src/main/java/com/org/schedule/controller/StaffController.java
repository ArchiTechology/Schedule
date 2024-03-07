package com.org.schedule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.org.schedule.dto.StaffDTO;
import com.org.schedule.model.Staff;
import com.org.schedule.service.ServiceInterface;

@RestController
public class StaffController {
  
	@Autowired
	 public  ServiceInterface serviceInterface;
	
	@PostMapping("saveStaff")
	 public ModelAndView getStaffRecord(@ModelAttribute ("staffDto") StaffDTO staffDTO)
	 {
		
		return null;
		 
	 }
	
}
