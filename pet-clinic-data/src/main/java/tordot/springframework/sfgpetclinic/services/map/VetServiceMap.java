package tordot.springframework.sfgpetclinic.services.map;


import org.springframework.stereotype.Service;
import tordot.springframework.sfgpetclinic.model.Vet;
import tordot.springframework.sfgpetclinic.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
         super.deleteById(id);

    }

    @Override
    public void delete(Vet object) {
       super.delete(object);

    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
