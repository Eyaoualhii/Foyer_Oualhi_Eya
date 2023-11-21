package tn.esprit.foyer_oualhieya.DAO.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation {


    @Id
    @Column(name = "identifiantReservation")
    private String idReservation;
    private Date anneUniversitaire;
    private Boolean estValide;



    @ManyToMany
    List<Etudiant> etudiants;

}
