package tordot.springframework.sfgpetclinic.services;

import tordot.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastname);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
