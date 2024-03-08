package com.schedule.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schedule.app.model.Staff;

public interface StaffRepository  extends JpaRepository<Staff, Long>{

}
