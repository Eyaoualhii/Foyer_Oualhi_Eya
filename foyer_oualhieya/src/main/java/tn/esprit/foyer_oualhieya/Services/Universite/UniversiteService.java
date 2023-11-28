package tn.esprit.foyer_oualhieya.Services.Universite;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_oualhieya.DAO.Entities.Universite;
import tn.esprit.foyer_oualhieya.DAO.Repository.UniversiteRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService{

    UniversiteRepository universiterepo;


    @Override
    public List<Universite> getUniversitesList() {
        return universiterepo.findAll();
    }

    @Override
    public Optional<Universite> getUniversiteById(int id) {
        return universiterepo.findById(id);
    }

    @Override
    public Universite createUniversite(Universite universite) {
        return universiterepo.save(universite);
    }

    @Override
    public void deleteUniversite(int id) {
        universiterepo.deleteById(id);
    }
    public Universite updateUniversite(Universite u){
        return universiterepo.save(u);

    }

}
