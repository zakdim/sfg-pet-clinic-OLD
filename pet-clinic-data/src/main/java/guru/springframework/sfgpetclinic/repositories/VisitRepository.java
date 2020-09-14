package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dmitri on 2020-09-13.
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
