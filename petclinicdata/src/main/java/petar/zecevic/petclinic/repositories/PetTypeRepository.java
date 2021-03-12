package petar.zecevic.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import petar.zecevic.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
