package com.schedule.app.authuntication;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.schedule.app.model.Staff;

public class CustomUserDetails implements UserDetails {

	private static final long serialVersionUID = 1L;

	@Autowired
	Staff staff;

	public CustomUserDetails(Staff staff) {
		this.staff = staff;
		System.out.println(staff.toString());
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(() -> staff.getStaffRole());
	}

	@Override
	public String getPassword() {
		return staff.getStaffPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return staff.getStaffEmail();
	}
	
	  public String getStaffName()
	  {
		  return staff.getStaffName();
	  }

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
