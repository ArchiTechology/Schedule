package com.schedule.app;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.schedule.app.dto.ScheduleDTO;
import com.schedule.app.model.Staff;
import com.schedule.app.model.Subject;
import com.schedule.app.service.ScheduleInterface;

@RestController
public class ScheduleController {

	@Autowired
	ScheduleInterface scheduleInterface;

	@GetMapping("/schedule")
	public ModelAndView getSchedulePage(ModelMap modelMap) {
		List<Subject> subject = new ArrayList<Subject>();
		List<Staff> staff = new ArrayList<Staff>();

		
		subject = scheduleInterface.fetchSubjects();
		staff = scheduleInterface.fetchStaffRecords();

		for (Iterator<Staff> iterator = staff.iterator(); iterator.hasNext();) {
			Staff sub = (Staff) iterator.next();
			System.out.println(sub.getStaffName());
		}

		modelMap.addAttribute("subject", subject);
		modelMap.addAttribute("faculties", staff);

		return new ModelAndView("SchedulePage");
	}

	@GetMapping("/admin")
	public ModelAndView getAdminPage(ModelMap modelMap) {
              String AdminName=  scheduleInterface.findByStaffRole();
              System.err.println("===>"+AdminName);
              
              modelMap.addAttribute("admin", AdminName);
              
		return new ModelAndView("Dashboard");
	}

	@GetMapping("/sheduleData/{sName}/{staffId}/{first}/{second}/{third}/{fourth}/{fifth}/{sixth}")
	public ModelAndView getScheduleRecords(
		@PathVariable("sName") String StaffName,
			@PathVariable("staffId") String staffId,
			@PathVariable("second") String second, @PathVariable("first") String first,
			@PathVariable("third") String third, @PathVariable("fourth") String fourth,
			@PathVariable("fifth") String fifth, @PathVariable("sixth") String sixth) {
		try {
			ScheduleDTO schedule = new ScheduleDTO(first, second, third, fourth, fifth, sixth,  StaffName,staffId);
			System.out.println(schedule.toString());
			return new ModelAndView("admin");
		} catch (Exception ex) {

		}
		return null;
	}

}
