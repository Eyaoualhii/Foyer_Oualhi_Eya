package tn.esprit.foyer_oualhieya.DAO.Entities;

import jakarta.persistence.*;

@Entity
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identifiantFoyer")
    private long idFoyer;

    private String nomFoyer;
    private long capaciteFoyer;

}
