package com.lipik.petclinik.services.map;

import com.lipik.petclinik.model.Owner;
import com.lipik.petclinik.model.Pet;
import com.lipik.petclinik.model.PetType;
import com.lipik.petclinik.services.OwnerService;
import com.lipik.petclinik.services.PetService;
import com.lipik.petclinik.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetService petService;
    private final PetTypeService petTypeService;

    public OwnerServiceMap(PetService petService, PetTypeService petTypeService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
    }

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

        if(object != null){
            if(object.getPets()!=null){
                object.getPets().forEach(pet -> {
                    if(pet.getPetType() != null){
                        if(pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    }else{
                        throw new RuntimeException("pet type required");
                    }

                    if(pet.getId() == null){
                        Pet savedPet1 = petService.save(pet);
                        pet.setId((savedPet1).getId());
                    }
                });
            }
            return super.save(object);
        }
        return  null;

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
