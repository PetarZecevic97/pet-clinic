package petar.zecevic.petclinic.model;

import java.time.LocalDate;

public class Pet {

    private PetType perType;
    private Owner owner;
    private LocalDate birthday;

    public PetType getPerType() {
        return perType;
    }

    public void setPerType(PetType perType) {
        this.perType = perType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}