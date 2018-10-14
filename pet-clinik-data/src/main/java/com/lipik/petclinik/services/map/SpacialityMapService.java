package com.lipik.petclinik.services.map;

import com.lipik.petclinik.model.Speciality;
import com.lipik.petclinik.services.SpecialitiesService;
import org.springframework.stereotype.Service;


import java.util.Set;

@Service
public class SpacialityMapService extends AbstractMapService<Speciality, Long> implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findId(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
