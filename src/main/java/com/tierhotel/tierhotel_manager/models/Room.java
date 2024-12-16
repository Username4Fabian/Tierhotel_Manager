package com.tierhotel.tierhotel_manager.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long id;
    private int roomNumber;
    private int space; 

    public Room() {
    }

    public Room(Long id, int roomNumber, int space) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.space = space;
    }

    public Long getId() {
        return id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getSpace() {
        return space;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
