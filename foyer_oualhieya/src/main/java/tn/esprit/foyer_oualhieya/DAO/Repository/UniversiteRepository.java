package tn.esprit.foyer_oualhieya.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.foyer_oualhieya.DAO.Entities.Universite;

import java.util.Date;
import java.util.List;

public interface UniversiteRepository extends JpaRepository<Universite,Integer> {


    List<Universite> findByFoyerBlocsChambresReservationsEtudiantsNomEtAndDateNaissanceBetween(String nomEt, Date datemin, Date datemax);
}
