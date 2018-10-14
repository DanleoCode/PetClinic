package com.lipik.petclinik.bootstrap;


import com.lipik.petclinik.model.Owner;
import com.lipik.petclinik.model.Pet;
import com.lipik.petclinik.model.PetType;
import com.lipik.petclinik.model.Vet;
import com.lipik.petclinik.services.OwnerService;
import com.lipik.petclinik.services.PetTypeService;
import com.lipik.petclinik.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cat");
        PetType savedCatPetType = petTypeService.save(cat);

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

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("tanni");
        vet2.setLastName("mulla");

        vetService.save(vet2);

        System.out.println("loaded Vet");

    }
}
