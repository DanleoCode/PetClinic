package com.lipik.petclinik.services;

import com.lipik.petclinik.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
