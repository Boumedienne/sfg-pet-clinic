package tordot.springframework.sfgpetclinic.services;

import tordot.springframework.sfgpetclinic.model.Owner;

public interface OwnerService  extends CrudService<Owner,Long>{

    Owner findByLastName(String lastname);


}
