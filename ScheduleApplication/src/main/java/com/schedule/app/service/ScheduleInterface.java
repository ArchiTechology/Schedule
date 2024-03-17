package com.schedule.app.service;

import java.util.List;

import com.schedule.app.dto.ClassRoomDTO;
import com.schedule.app.dto.StaffDTO;
import com.schedule.app.dto.SubjectDTO;
import com.schedule.app.model.ClassRoom;
import com.schedule.app.model.Staff;
import com.schedule.app.model.Subject;

public interface ScheduleInterface {

	
	  public String  addStaffRecords(StaffDTO staffDto);

	public List<Staff> fetchStaffRecords();

	public String  AddSubject(SubjectDTO subjectDTO);

	public List<Subject> fetchSubjects();

	public String addClassRoom(ClassRoomDTO classRoomDTO);

	public List<ClassRoom> fetchClassRoomRecords();

	public String deleteClassRoomRecord(long id);

	public long deleteStaffRecord(long id);

	public long deleteSubject(long id);
}
