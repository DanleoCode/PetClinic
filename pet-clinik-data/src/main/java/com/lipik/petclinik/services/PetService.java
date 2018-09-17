package com.lipik.petclinik.services;

import com.lipik.petclinik.model.Owner;
import com.lipik.petclinik.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save (Pet pet);

    Set<Owner> findAll();
}
