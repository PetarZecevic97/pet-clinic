package petar.zecevic.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import petar.zecevic.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
