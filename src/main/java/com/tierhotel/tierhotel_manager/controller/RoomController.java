package com.tierhotel.tierhotel_manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.tierhotel.tierhotel_manager.models.Room;
import com.tierhotel.tierhotel_manager.repositories.RoomRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class RoomController {
    @SuppressWarnings("unused")
    @Autowired
    private RoomRepository roomRepository;

    @PostMapping("/createRoom")
    public Room createRoom(@RequestBody Room room) {
        return roomRepository.save(room);
    }
    

}
