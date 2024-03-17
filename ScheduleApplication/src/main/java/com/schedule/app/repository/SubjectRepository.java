package com.schedule.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.schedule.app.model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
