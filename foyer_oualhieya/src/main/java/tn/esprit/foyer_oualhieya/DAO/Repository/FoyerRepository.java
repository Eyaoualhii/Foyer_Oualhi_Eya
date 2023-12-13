package tn.esprit.foyer_oualhieya.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.foyer_oualhieya.DAO.Entities.Bloc;
import tn.esprit.foyer_oualhieya.DAO.Entities.Foyer;
import tn.esprit.foyer_oualhieya.DAO.Entities.TypeChambre;
import tn.esprit.foyer_oualhieya.DAO.Entities.Universite;

import java.util.List;


public interface FoyerRepository extends JpaRepository<Foyer,Integer> {

    List<Foyer> findByBlocs(Bloc bloc);

    Foyer findByIdFoyer(Bloc bloc);

    List<Foyer> findByBlocs(long capaciteBloc);

     Foyer findByBlocsFoyerUniversite(Universite universite);

    //bel keyword menghir @query juste methode

    List<Foyer> findByCapaciteFoyerGreaterThan(long capacite);

    Foyer findByCapaciteFoyerLessThan(long capacite);

    Foyer findByCapaciteFoyerBetween(long capaciteMin,long capaciteMax);

    //afficher le foyer de l'universite dont son nom est passe en parametre
    // select f from Foyer f JOIN Universite u ON <condition de jointure> where
    Foyer findByUniversiteNomUniversite(String nom);

    //afficher la liste des foyers qui comprte des chambres de meme type aue le type passe en parametre
    // Foyer->Bloc->Chambre
    List<Foyer> findByBlocsChambresTypeC(TypeChambre typeChambre);
}
