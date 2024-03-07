package com.org.schedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.schedule.model.Staff;

public interface StaffRepository extends JpaRepository<Staff, Long> {

}
