package tn.esprit.foyer_oualhieya.Services.Chambre;

import tn.esprit.foyer_oualhieya.DAO.Entities.Bloc;
import tn.esprit.foyer_oualhieya.DAO.Entities.Chambre;

import java.util.List;
import java.util.Optional;

public interface IChambreService {
    List<Chambre> getChambresList();

    public Optional<Chambre> getChambreById(int id);
    public Chambre createChambre(Chambre chambre);
    public void deleteChambre(int id);
    Chambre updateChambre(Chambre b) ;

}
