package petar.zecevic.petclinic.services;

import petar.zecevic.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
