package tn.esprit.foyer_oualhieya.DAO.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation {


    @Id
    @Column(name = "identifiantReservation")
    private long idReservation;
    private Date anneUniversitaire;
    private Boolean estValide;


}
