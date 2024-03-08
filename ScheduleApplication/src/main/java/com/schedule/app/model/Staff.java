package com.schedule.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long StaffId;
	private String StaffName;
	private String StaffEmail;
	private String StaffRole;
	private String StaffPassword;
	public Staff(String staffName, String staffEmail, String staffRole, String staffPassword) {
		StaffName = staffName;
		StaffEmail = staffEmail;
		StaffRole = staffRole;
		StaffPassword = staffPassword;
	}
	
}
