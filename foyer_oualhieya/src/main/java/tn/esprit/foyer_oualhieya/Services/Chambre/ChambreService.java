package tn.esprit.foyer_oualhieya.Services.Chambre;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_oualhieya.DAO.Entities.Bloc;
import tn.esprit.foyer_oualhieya.DAO.Entities.Chambre;
import tn.esprit.foyer_oualhieya.DAO.Repository.ChambreRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService{

    ChambreRepository chambrerepo;


    @Override
    public List<Chambre> getChambresList() {
        return chambrerepo.findAll();
    }

    @Override
    public Optional<Chambre> getChambreById(int id) {
        return chambrerepo.findById(id);
    }

    @Override
    public Chambre createChambre(Chambre chambre) {
        return chambrerepo.save(chambre);
    }

    @Override
    public void deleteChambre(int id) {
        chambrerepo.deleteById(id);
    }

    @Override
    public Chambre updateChambre(Chambre b) {
        return chambrerepo.save(b);
    }

}
