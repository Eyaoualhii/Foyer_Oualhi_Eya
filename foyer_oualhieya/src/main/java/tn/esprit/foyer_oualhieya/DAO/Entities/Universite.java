package tn.esprit.foyer_oualhieya.DAO.Entities;

import jakarta.persistence.*;

@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identifiantUniversite")
    private long idUniversite;

    private String nomUniversite;
    private String adresse;

}
