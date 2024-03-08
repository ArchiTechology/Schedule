package com.schedule.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schedule.app.dto.ClassRoomDTO;
import com.schedule.app.dto.StaffDTO;
import com.schedule.app.dto.SubjectDTO;
import com.schedule.app.model.ClassRoom;
import com.schedule.app.model.Staff;
import com.schedule.app.model.Subject;
import com.schedule.app.repository.ClassRoomRepository;
import com.schedule.app.repository.StaffRepository;
import com.schedule.app.repository.SubjectRepository;

@Service
public class ScheduleImplaService implements ScheduleInterface {

	@Autowired
	StaffRepository staffRepository;

	@Autowired
	SubjectRepository subjectRepository;
	@Autowired
	ClassRoomRepository classRoomRepository;

	@Override
	public String addStaffRecords(StaffDTO staffDto) {

		Staff staff = new Staff(staffDto.getStaffName(), staffDto.getStaffEmail(), staffDto.getStaffRole(),
				staffDto.getStaffPassword());

		System.out.println(staffDto.toString());
		try {
			staffRepository.save(staff);
			return staff.getStaffName();
		} catch (Exception ex) {
			return "Staff Records not Found";
		}

	}

	@Override
	public List<Staff> fetchStaffRecords() {
		return staffRepository.findAll();
	}

	@Override
	public String AddSubject(SubjectDTO subjectDTO) {

		Subject subject = new Subject();
		subject.setSubjectName(subjectDTO.getSubjectName());

		try {
			subjectRepository.save(subject);
			return subject.getSubjectName();
		} catch (Exception ex) {
			return " Subject not added...";
		}
	}

	@Override
	public List<Subject> fetchSubjects() {

		return subjectRepository.findAll();
	}

	@Override
	public String addClassRoom(ClassRoomDTO classRoomDTO) {
		ClassRoom classRoom = new ClassRoom(classRoomDTO.getClassRoomFloorNumber(), classRoomDTO.getClassQuntity());
		try {
			classRoomRepository.save(classRoom);
			return "Add Classroom";
		} catch (Exception ex) {
			return "something wrong";
		}
	}

	@Override
	public List<ClassRoom> fetchClassRoomRecords() {
		return classRoomRepository.findAll();
	}

	@Override
	public String deleteClassRoomRecord(long id) {
		try {
			classRoomRepository.deleteById(id);
			return id + "deleted Successfully..";
		} catch (Exception ex) {
			return id + "not Deleted";
		}
	}

	@Override
	public long deleteStaffRecord(long id) {
		try {
			staffRepository.deleteById(id);
			return 0;
		} catch (Exception ex) {
			return id;
		}

	}

	@Override
	public long deleteSubject(long id) {
		try {
			subjectRepository.deleteById(id);
			return id;
		} catch (Exception e) {
			return 0;
		}

	}

}
