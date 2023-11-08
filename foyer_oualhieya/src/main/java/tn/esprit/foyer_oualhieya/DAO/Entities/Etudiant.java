package tn.esprit.foyer_oualhieya.DAO.Entities;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identifiant")
    private long id;

    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    private Date dateNaissance;



}
