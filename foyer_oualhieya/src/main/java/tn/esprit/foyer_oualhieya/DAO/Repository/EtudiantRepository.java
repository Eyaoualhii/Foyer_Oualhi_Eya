package tn.esprit.foyer_oualhieya.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.foyer_oualhieya.DAO.Entities.Etudiant;

import java.util.Date;
import java.util.List;


public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

    Etudiant findByNomEtAndPrenomEt(String nomEt,String prenomEt);
    // select * from Etudiant where cin=
    Etudiant  findByCin(long cin);

    //select * from Etudiant where nomEt like...
    List<Etudiant> findByNomEtLike(String nomEt);

    List<Etudiant> findByNomEtContains(String nomEt);

    List<Etudiant>  findByNomEtContaining(String nomEt);

    List<Etudiant> findByDateNaissanceGreaterThan(Date date);

    List<Etudiant> findByEcole(String Ecole);

    List<Etudiant> findByReservationsIdReservation(String idReservation);

    List<Etudiant> findByReservationsAnneUniversitaire(Date anneUniversitaire);

    List<Etudiant> findByDateNaissanceGreaterThanAndEcole(Date date,String Ecole);

    List<Etudiant> findByReservationsAnneUniversitaireOOrderByDateNaissance(Date date);


    long  count(long cin);

    long  countByCinAndNomEt(long cin,String nomEt);


}
