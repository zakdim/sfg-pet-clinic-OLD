package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by dmitri on 2020-08-09.
 */
public class Vet extends Person {

    private Set<Specialty> specialties;

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
