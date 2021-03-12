package petar.zecevic.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import petar.zecevic.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
