package com.tierhotel.tierhotel_manager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tierhotel.tierhotel_manager.models.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{
    
}