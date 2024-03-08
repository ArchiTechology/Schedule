package com.schedule.app.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class StaffDTO {
	private String StaffName;
	private String StaffEmail;
	private String StaffRole;
	private String StaffPassword;
	public StaffDTO(String staffName, String staffEmail, String staffRole, String staffPassword) {
		StaffName = staffName;
		StaffEmail = staffEmail;
		StaffRole = staffRole;
		StaffPassword = staffPassword;
	}
	
}
