package com.org.schedule.model;

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
	 private String StaffContact;
	 private String Password;
	 private String RePassowrd;
	
         private String Address;
	public Staff(String staffName, String staffEmail, String staffContact, String password, String rePassowrd) {
	
		StaffName = staffName;
		StaffEmail = staffEmail;
		StaffContact = staffContact;
		Password = password;
		RePassowrd = rePassowrd;
	}
	 
	 
}
