package tn.esprit.foyer_oualhieya.Services.Etudiant;


import tn.esprit.foyer_oualhieya.DAO.Entities.Bloc;
import tn.esprit.foyer_oualhieya.DAO.Entities.Chambre;
import tn.esprit.foyer_oualhieya.DAO.Entities.Etudiant;

import java.util.List;
import java.util.Optional;

public interface IEtudiantService {

    List<Etudiant> getEtudiantsList();

    public Optional<Etudiant> getEtudiantById(int id);
    public Etudiant createEtudiant(Etudiant etudiant);
    public void deleteEtudiant(int id);

    Etudiant updateEtudiant(Etudiant e) ;

}
