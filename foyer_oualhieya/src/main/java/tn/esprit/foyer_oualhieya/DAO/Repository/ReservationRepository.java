package tn.esprit.foyer_oualhieya.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer_oualhieya.DAO.Entities.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
