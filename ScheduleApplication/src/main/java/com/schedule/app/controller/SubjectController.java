package com.schedule.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schedule.app.dto.SubjectDTO;
import com.schedule.app.model.Subject;
import com.schedule.app.service.ScheduleInterface;

@RestController
public class SubjectController {

	@Autowired
	ScheduleInterface scheduleInterface;

	@PostMapping("/addSubject")
	public ResponseEntity<String> addSubjectRecords(@RequestBody SubjectDTO subjectDTO) {
		String SubjectName = scheduleInterface.AddSubject(subjectDTO);
		return new ResponseEntity<String>(SubjectName, HttpStatus.ACCEPTED);
	}

	@GetMapping("/subjectlist")
	public List<Subject> fetchSubjectList() {
		return scheduleInterface.fetchSubjects();
	}
	@DeleteMapping("/deletesubject/(id)")
	public ResponseEntity<Long> deleteSubjectId(@PathVariable("id") long id) {
		long deleteId = scheduleInterface.deleteSubject(id);
		return new ResponseEntity<Long>(deleteId, HttpStatus.ACCEPTED);

	}
}
