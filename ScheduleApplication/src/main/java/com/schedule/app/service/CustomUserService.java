package com.schedule.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.schedule.app.authuntication.CustomUserDetails;
import com.schedule.app.model.Staff;
import com.schedule.app.repository.StaffRepository;

@Service
public class CustomUserService implements UserDetailsService {

	@Autowired
	StaffRepository staffRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Staff staff = staffRepository.findByStaffEmail(username);

		if (staff == null) {
			throw new UsernameNotFoundException(username + "  Not Found");
		}
		return new CustomUserDetails(staff);
	}

}
