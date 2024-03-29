package todot.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tordot.springframework.sfgpetclinic.model.Owner;
import tordot.springframework.sfgpetclinic.model.Vet;
import tordot.springframework.sfgpetclinic.services.OwnerService;
import tordot.springframework.sfgpetclinic.services.VetService;


@Component
public class DataLoader  implements CommandLineRunner {


 private final OwnerService ownerService;

 private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Boumediene");
        owner1.setLastName("Bouzidi");

        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setId(2L);
        owner2.setFirstName("SOF");
        owner2.setLastName("BEN");

        ownerService.save(owner2);


        System.out.println("Loaded Owner ...");

        Vet vet1=new Vet();
        vet1.setId(1L);
        vet1.setFirstName("B2");
        vet1.setLastName("B3");

        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setId(2L);
        vet2.setFirstName("B4");
        vet2.setLastName("B5");

        vetService.save(vet2);


        System.out.println("Loaded Vet ...");






    }
}
