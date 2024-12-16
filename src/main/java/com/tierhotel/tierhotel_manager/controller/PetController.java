package com.tierhotel.tierhotel_manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.tierhotel.tierhotel_manager.models.Pet;
import com.tierhotel.tierhotel_manager.repositories.PetRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PetController {
    @SuppressWarnings("unused")
    @Autowired
    private PetRepository petRepository;

    @PostMapping("/createPet")
    public Pet createPet(@RequestBody Pet pet) {
        return petRepository.save(pet);
    }
    
}
