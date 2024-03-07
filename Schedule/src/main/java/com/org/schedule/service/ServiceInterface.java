package com.org.schedule.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.org.schedule.dto.StaffDTO;
import com.org.schedule.model.Staff;

@Service
public interface ServiceInterface {

	  public String saveStaffRecords(StaffDTO staffDTO);
}
