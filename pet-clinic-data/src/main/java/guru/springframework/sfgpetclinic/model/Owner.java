package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by dmitri on 2020-08-09.
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
