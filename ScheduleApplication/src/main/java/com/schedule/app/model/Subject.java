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
public class Subject{
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long SubjectId;
	 private String SubjectName;
	 

}
