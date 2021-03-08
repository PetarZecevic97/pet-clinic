package petar.zecevic.petclinic.services;

import petar.zecevic.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner finById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
