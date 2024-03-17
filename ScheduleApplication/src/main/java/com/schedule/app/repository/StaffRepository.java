package com.schedule.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.schedule.app.model.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
  
    @Query("SELECT s FROM Staff s WHERE s.StaffEmail = ?1")
    public Staff findByStaffEmail(String staffEmail);
}
