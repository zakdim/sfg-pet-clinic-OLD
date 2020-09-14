package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dmitri on 2020-09-13.
 */
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
