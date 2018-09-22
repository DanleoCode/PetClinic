package com.lipik.petclinik.services.map;

import com.lipik.petclinik.model.Owner;
import com.lipik.petclinik.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findId(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
    super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
    super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
