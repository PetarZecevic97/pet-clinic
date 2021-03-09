package petar.zecevic.petclinic.services;

import petar.zecevic.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
