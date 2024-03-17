package com.schedule.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schedule.app.model.ClassRoom;

public interface ClassRoomRepository extends JpaRepository<ClassRoom, Long> {

}
