package com.org.schedule.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.schedule.dto.StaffDTO;
import com.org.schedule.model.Staff;
import com.org.schedule.repository.StaffRepository;

@Service
public class ServiceImpl implements ServiceInterface {
	@Autowired
	StaffRepository staffRepository;

	@Override
	public String saveStaffRecords(StaffDTO staffDTO) {

		Staff staff = new Staff(staffDTO.getStaffName(), staffDTO.getStaffEmail(), staffDTO.getStaffContact(),
				staffDTO.getPassword(), staffDTO.getRePassowrd());
		staffRepository.save(staff);
		return staff.getStaffName();
	}

}
