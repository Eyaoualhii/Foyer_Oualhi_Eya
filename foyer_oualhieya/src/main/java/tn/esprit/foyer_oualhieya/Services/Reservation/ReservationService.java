package tn.esprit.foyer_oualhieya.Services.Reservation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_oualhieya.DAO.Repository.ReservationRepository;
@Service
@AllArgsConstructor
public class ReservationService implements IReservationService{

    ReservationRepository reservationrepo;


}
