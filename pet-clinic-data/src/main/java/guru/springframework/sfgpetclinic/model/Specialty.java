package guru.springframework.sfgpetclinic.model;

/**
 * Created by dmitri on 2020-08-27.
 */
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
