package com.lipik.petclinik.bootstrap;


import com.lipik.petclinik.model.*;
import com.lipik.petclinik.services.OwnerService;
import com.lipik.petclinik.services.PetTypeService;
import com.lipik.petclinik.services.SpecialityService;
import com.lipik.petclinik.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {

        Set<PetType> pets = petTypeService.findAll();

        if(pets.isEmpty())
            loadData();

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("READIOLOGY");
        Speciality savedRadioLogy = specialityService.save(radiology);


        Speciality surgery = new Speciality();
        surgery.setDescription("SERGERY");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("DENTISTRY");
        Speciality savedDentist = specialityService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Ashok");
        owner1.setLastName("charsi");
        owner1.setAddress("S R NAmager");
        owner1.setCity("HYD");
        owner1.setTelephone("123123123");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("TB");
        owner2.setLastName("YAHA");
        owner2.setAddress("S R NAmager");
        owner2.setCity("HYD");
        owner2.setTelephone("123123123");

        ownerService.save(owner2);

        Pet charasPet = new Pet();
        charasPet.setPetType(dog);
        charasPet.setOwner(owner1);
        charasPet.setBirthDate(LocalDate.now());
        charasPet.setName("Charsi");

        owner1.getPets().add(charasPet);

        Pet charasCat = new Pet();
        charasCat.setPetType(cat);
        charasCat.setOwner(owner2);
        charasCat.setBirthDate(LocalDate.now());
        charasCat.setName("Charsi cat");

        owner2.getPets().add(charasCat);


        System.out.println("loaded Owner");

        Vet vet1 = new Vet();
        vet1.setFirstName("akki");
        vet1.setLastName("bhai");
        vet1.getSpecialities().add(radiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("tanni");
        vet2.setLastName("mulla");
        vet1.getSpecialities().add(surgery);

        vetService.save(vet2);

        System.out.println("loaded Vet");
    }
}
