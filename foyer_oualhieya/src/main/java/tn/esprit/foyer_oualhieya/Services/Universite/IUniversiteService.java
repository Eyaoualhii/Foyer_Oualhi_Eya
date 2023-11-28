package tn.esprit.foyer_oualhieya.Services.Universite;

import tn.esprit.foyer_oualhieya.DAO.Entities.Bloc;
import tn.esprit.foyer_oualhieya.DAO.Entities.Reservation;
import tn.esprit.foyer_oualhieya.DAO.Entities.Universite;

import java.util.List;
import java.util.Optional;

public interface IUniversiteService {

    List<Universite> getUniversitesList();

    public Optional<Universite> getUniversiteById(int id);
    public Universite createUniversite(Universite universite);
    public void deleteUniversite(int id);

    public Universite updateUniversite(Universite u);
}
