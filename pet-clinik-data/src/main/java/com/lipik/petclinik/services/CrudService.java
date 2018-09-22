package com.lipik.petclinik.services;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findId(ID id);

    T save(T Object);

    void deleted(T object);

    void deleteById(ID id);


}
