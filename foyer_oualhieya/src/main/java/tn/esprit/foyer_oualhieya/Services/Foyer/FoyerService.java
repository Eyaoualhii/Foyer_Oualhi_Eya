package tn.esprit.foyer_oualhieya.Services.Foyer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_oualhieya.DAO.Entities.Foyer;
import tn.esprit.foyer_oualhieya.DAO.Repository.FoyerRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService{

    FoyerRepository foyerrepo;


    @Override
    public List<Foyer> getFoyersList() {
        return foyerrepo.findAll();
    }

    @Override
    public Optional<Foyer> getFoyerById(int id) {
        return foyerrepo.findById(id);
    }

    @Override
    public Foyer createFoyer(Foyer foyer) {
       return foyerrepo.save(foyer);
    }

    @Override
    public void deleteFoyer(int id) {
        foyerrepo.deleteById(id);
    }

    public Foyer updateFoyer(Foyer f){
        return foyerrepo.save(f);
    }
}
