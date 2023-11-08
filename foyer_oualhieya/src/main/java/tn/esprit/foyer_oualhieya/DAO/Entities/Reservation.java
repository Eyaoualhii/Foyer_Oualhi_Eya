package tn.esprit.foyer_oualhieya.DAO.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Reservation {


    @Id
    @Column(name = "identifiantReservation")
    private long idReservation;
    private Date anneUniversitaire;
    private Boolean estValide;


}
