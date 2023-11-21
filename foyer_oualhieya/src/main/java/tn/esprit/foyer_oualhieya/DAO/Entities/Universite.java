package tn.esprit.foyer_oualhieya.DAO.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identifiantUniversite")
    private int idUniversite;

    private String nomUniversite;
    private String adresse;

    @OneToOne
    private Foyer foyer;

}
