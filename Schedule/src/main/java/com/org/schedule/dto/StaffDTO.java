package com.org.schedule.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class StaffDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long StaffId;
	 private String StaffName;
	 private String StaffEmail;
	 private String StaffContact;
	 private String Password;
	 private String RePassowrd;
	 private String Role;
	 
}