package com.lipik.petclinik.services.map;

import com.lipik.petclinik.model.PetType;
import com.lipik.petclinik.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findId(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public PetTYpe save(PetType Object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
