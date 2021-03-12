package petar.zecevic.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import petar.zecevic.petclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
