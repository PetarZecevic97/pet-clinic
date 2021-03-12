package petar.zecevic.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import petar.zecevic.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
