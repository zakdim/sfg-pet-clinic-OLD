package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by dmitri on 2020-08-11.
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
