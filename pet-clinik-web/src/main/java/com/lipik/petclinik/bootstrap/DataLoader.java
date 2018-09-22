package com.lipik.petclinik.bootstrap;


import com.lipik.petclinik.model.Owner;
import com.lipik.petclinik.model.Vet;
import com.lipik.petclinik.services.OwnerService;
import com.lipik.petclinik.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Ashok");
        owner1.setLastName("charsi");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("TB");
        owner2.setLastName("YAHA");

        ownerService.save(owner2);

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
