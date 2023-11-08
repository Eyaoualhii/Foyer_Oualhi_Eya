package tn.esprit.foyer_oualhieya.DAO.Entities;

import jakarta.persistence.*;

@Entity
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identifiantBloc")
    private long idBloc;

    private String nomBloc;

    private long capaciteBloc;
}
