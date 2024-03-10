package com.schedule.app.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ScheduleDTO {

	private String First;
	private String Second;
	private String Third;
	private String Fourth;
	private String Fifth;
	private String Sixth;
	private String StaffId;
	private String StaffName;

	public ScheduleDTO(String first, String second, String third, String fourth, String fifth, String sixth,
			String StaffName, String staffId) {
		First = first;
		Second = second;
		Third = third;
		Fourth = fourth;
		Fifth = fifth;
		Sixth = sixth;
		StaffId = staffId;
		this.StaffName = StaffName;
	}
}
