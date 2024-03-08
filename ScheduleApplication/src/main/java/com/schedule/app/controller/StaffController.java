package com.schedule.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schedule.app.dto.StaffDTO;
import com.schedule.app.model.Staff;
import com.schedule.app.service.ScheduleInterface;

@RestController
public class StaffController {

	@Autowired
	ScheduleInterface scheduleInterface;
	
	 @PostMapping("/registration")
	   public ResponseEntity<String> regsitrationStaff( @RequestBody StaffDTO staffDTO)
	   {
		 System.err.println(staffDTO.toString());
		String StaffName= scheduleInterface.addStaffRecords(staffDTO);
		 return  new  ResponseEntity<String>(StaffName, HttpStatus.ACCEPTED);
	   }
	 
	 @GetMapping("/staffRecords")
	 public List<Staff> getStaffRecords()
	 {
		  return scheduleInterface.fetchStaffRecords();
	 }
	 @DeleteMapping("/deleteStaff/{Id}")
	  public  ResponseEntity<Long> deleteStaffRecord(@PathVariable("Id") long Id)
	  {
		long deleteid= scheduleInterface.deleteStaffRecord(Id);
		 return new ResponseEntity<Long>(deleteid, HttpStatus.ACCEPTED);
	  }
	 
}
