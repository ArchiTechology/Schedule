package com.schedule.app.model;

import jakarta.persistence.Entity;
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
@Entity
public class Schedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ScheduleId;
	private String First;
	private String Second;
	private String Third;
	private String Fourth;
	private String Fifth;
	private String Sixth;
	private String StaffId;
	private String StaffName;

	public Schedule(String first, String second, String third, String fourth, String fifth, String sixth, String StaffName,
		String staffId) {
		First = first;
		Second = second;	
		Third = third;
		Fourth = fourth;
		Fifth = fifth;
		Sixth = sixth;
		StaffId = staffId;
		this.StaffName=StaffName;
	}

}
