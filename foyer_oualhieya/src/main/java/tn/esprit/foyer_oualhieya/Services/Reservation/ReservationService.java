package tn.esprit.foyer_oualhieya.Services.Reservation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_oualhieya.DAO.Entities.Reservation;
import tn.esprit.foyer_oualhieya.DAO.Repository.ReservationRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService{

    ReservationRepository reservationrepo;


    @Override
    public List<Reservation> getReservationsList() {
        return reservationrepo.findAll();
    }

    @Override
    public Optional<Reservation> getReservationById(int id) {
        return reservationrepo.findById(String.valueOf(id));
    }

    @Override
    public Reservation createReservation(Reservation reservation) {
        return reservationrepo.save(reservation);
    }

    @Override
    public void deleteReservation(int id) {
        reservationrepo.deleteById(String.valueOf(id));
    }


    public Reservation updateReservation(Reservation r){
        return reservationrepo.save(r);
    }
}
