package com.schedule.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.schedule.app.model.Staff;
import com.schedule.app.model.Subject;
import com.schedule.app.service.ScheduleInterface;

@RestController
public class ScheduleController {

	@Autowired
	ScheduleInterface scheduleInterface;
	
	@GetMapping
	   public ModelAndView getSchedulePage(ModelMap modelMap)
	   {
		 List<Subject> subject = new ArrayList<Subject>();
		 List<Staff> staff = new  ArrayList<Staff>();

		 
		 subject=	scheduleInterface.fetchSubjects();
		 staff= scheduleInterface.fetchStaffRecords();
		 
		  for (Iterator<Staff> iterator = staff.iterator(); iterator.hasNext();) {
			  Staff sub = (Staff) iterator.next();
			System.out.println(sub.getStaffName());
		}
		 
		 modelMap.addAttribute("subject",subject);
		 modelMap.addAttribute("faculties", staff);
		 
		   return new ModelAndView("SchedulePage");
	   }
}
