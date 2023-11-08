package tn.esprit.foyer_oualhieya.DAO.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Chambre {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identifiantChambre")
    private long idChambre;
    private long numeroChambre;
    private TypeChambre typeC;
}
