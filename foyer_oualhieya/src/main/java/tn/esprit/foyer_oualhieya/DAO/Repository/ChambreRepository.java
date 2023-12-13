package tn.esprit.foyer_oualhieya.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer_oualhieya.DAO.Entities.Bloc;
import tn.esprit.foyer_oualhieya.DAO.Entities.Chambre;
import tn.esprit.foyer_oualhieya.DAO.Entities.TypeChambre;

import java.util.Date;
import java.util.List;


public interface ChambreRepository extends JpaRepository<Chambre,Integer> {

    Chambre findByNumeroChambre(long numeroChambre);

    List<Chambre>  findByTypeC(TypeChambre typeC);

    List<Chambre>  findByBloc(Bloc bloc);

    List<Chambre>  findByNumeroChambreAndTypeC(long numeroChambre,TypeChambre typeC);

    List<Chambre> findByBlocFoyerUniversiteNomAnneeReservationNomEtudiantNumeroChambre (String nomUniversite, Date anneUniversitaire,String nomEt,long numeroChambre);



}
