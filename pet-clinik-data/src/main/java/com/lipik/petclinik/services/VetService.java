package com.lipik.petclinik.services;

import com.lipik.petclinik.model.Pet;
import com.lipik.petclinik.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save (Pet vet);

    Set<Vet> findAll();
}
