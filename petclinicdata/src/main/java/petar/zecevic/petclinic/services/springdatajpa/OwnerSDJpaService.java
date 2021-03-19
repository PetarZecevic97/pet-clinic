package petar.zecevic.petclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import petar.zecevic.petclinic.model.Owner;
import petar.zecevic.petclinic.repositories.OwnerRepository;
import petar.zecevic.petclinic.services.OwnerService;
import petar.zecevic.petclinic.services.PetService;
import petar.zecevic.petclinic.services.PetTypeService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetTypeService petTypeService, PetService petService) {
        this.ownerRepository = ownerRepository;
        this.petTypeService = petTypeService;
        this.petService = petService;
    }


    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();

        ownerRepository.findAll().forEach(owners::add);

        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {

        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {

        ownerRepository.deleteById(aLong);

    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public List<Owner> findAllByLastNameLike(String lastName) {
        return ownerRepository.findAllByLastNameLike(lastName);
    }
}
