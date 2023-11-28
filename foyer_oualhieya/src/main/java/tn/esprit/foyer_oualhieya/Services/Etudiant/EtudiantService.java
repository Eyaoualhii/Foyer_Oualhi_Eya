package tn.esprit.foyer_oualhieya.Services.Etudiant;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_oualhieya.DAO.Entities.Bloc;
import tn.esprit.foyer_oualhieya.DAO.Entities.Chambre;
import tn.esprit.foyer_oualhieya.DAO.Entities.Etudiant;
import tn.esprit.foyer_oualhieya.DAO.Repository.BlocRerpository;
import tn.esprit.foyer_oualhieya.DAO.Repository.EtudiantRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{

    EtudiantRepository etudiantrepo;
    @Override
    public List<Etudiant> getEtudiantsList() {
        return etudiantrepo.findAll();
    }

    @Override
    public Optional<Etudiant> getEtudiantById(int id) {
        return etudiantrepo.findById(id);
    }

    @Override
    public Etudiant createEtudiant(Etudiant etudiant) {
        return etudiantrepo.save(etudiant);
    }

    @Override
    public void deleteEtudiant(int id) {
        etudiantrepo.deleteById(id);
    }


    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantrepo.save(e);
    }

}
