package tn.esprit.foyer_oualhieya.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer_oualhieya.DAO.Entities.Reservation;

import java.util.Date;
import java.util.List;


public interface ReservationRepository extends JpaRepository<Reservation,String> {


    List<Reservation> findByEstValide(Boolean estValide);


    List<Reservation> findByEtudiantsID(int id);

    List<Reservation> findByAnneUniversitaireAndEstValide(Date anneUniversitaire, Boolean estValide);
}
