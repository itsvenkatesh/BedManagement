package com.flm.bed.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flm.bed.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{

}
