package com.schedule.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schedule.app.dto.ClassRoomDTO;
import com.schedule.app.model.ClassRoom;
import com.schedule.app.service.ScheduleInterface;

@RestController
public class ClassRoomController {
@Autowired
ScheduleInterface scheduleInterface;
	
	@PostMapping("/addClassRoom")
	  public ResponseEntity<String> addClassRoom(@RequestBody ClassRoomDTO classRoomDTO)
	  {
		   String  ClassRoom = scheduleInterface.addClassRoom(classRoomDTO)  ;
		return  new ResponseEntity<String>(ClassRoom, HttpStatus.ACCEPTED);
	  }
	
	@GetMapping("/classroomlist")
	 public List<ClassRoom> getClassRoom()
	 {
		  return   scheduleInterface.fetchClassRoomRecords();
	 }
	
	@DeleteMapping("/deleteclassroom/{id}")
	 public  ResponseEntity<String> deleteClassRoom(@PathVariable("id") long  Id)
	 {
		String messege = scheduleInterface.deleteClassRoomRecord(Id);
		
		return  new ResponseEntity<String>(messege, HttpStatus.ACCEPTED);
	 }
	
}
