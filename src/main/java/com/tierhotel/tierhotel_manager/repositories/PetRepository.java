package com.tierhotel.tierhotel_manager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tierhotel.tierhotel_manager.models.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{

}
