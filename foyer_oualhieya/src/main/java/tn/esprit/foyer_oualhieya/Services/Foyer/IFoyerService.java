package tn.esprit.foyer_oualhieya.Services.Foyer;

import tn.esprit.foyer_oualhieya.DAO.Entities.Bloc;
import tn.esprit.foyer_oualhieya.DAO.Entities.Foyer;

import java.util.List;
import java.util.Optional;

public interface IFoyerService {
    List<Foyer> getFoyersList();

    public Optional<Foyer> getFoyerById(int id);
    public Foyer createFoyer(Foyer foyer);
    public void deleteFoyer(int id);

    public Foyer updateFoyer(Foyer f);
}
