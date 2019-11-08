package tordot.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<Owner,ID> {
    Set<Owner> findAll();

    Owner findById(ID id);

    Owner save(Owner object);

    void delete(Owner object);

    void deleteById(ID id);


}
