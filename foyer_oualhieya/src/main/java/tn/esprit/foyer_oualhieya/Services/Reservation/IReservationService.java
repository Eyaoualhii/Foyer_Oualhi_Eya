package tn.esprit.foyer_oualhieya.Services.Reservation;

import tn.esprit.foyer_oualhieya.DAO.Entities.Foyer;
import tn.esprit.foyer_oualhieya.DAO.Entities.Reservation;

import java.util.List;
import java.util.Optional;

public interface IReservationService {

    List<Reservation> getReservationsList();

    public Optional<Reservation> getReservationById(int id);
    public Reservation createReservation(Reservation reservation);
    public void deleteReservation(int id);
    public Reservation updateReservation(Reservation r);
}
