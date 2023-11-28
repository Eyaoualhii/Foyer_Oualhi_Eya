package tn.esprit.foyer_oualhieya.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer_oualhieya.DAO.Entities.Foyer;
import tn.esprit.foyer_oualhieya.DAO.Entities.Reservation;
import tn.esprit.foyer_oualhieya.Services.Reservation.IReservationService;
import tn.esprit.foyer_oualhieya.Services.Reservation.ReservationService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/reservations")
public class ReservationController {

    IReservationService reservationService;

    @GetMapping
    public List<Reservation> getReservationsList() {
        return reservationService.getReservationsList();

    }

    @GetMapping("/{id}")
    public Optional<Reservation> getReservationById(@PathVariable int id) {
        return  reservationService.getReservationById(id);

    }

    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return  reservationService.createReservation(reservation);


    }
    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable int id) {
        reservationService.deleteReservation(id);
    }


}
