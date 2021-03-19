package petar.zecevic.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import petar.zecevic.petclinic.model.Owner;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
