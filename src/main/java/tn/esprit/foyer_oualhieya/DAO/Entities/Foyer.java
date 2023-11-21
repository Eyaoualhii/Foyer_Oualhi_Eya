package tn.esprit.foyer_oualhieya.DAO.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identifiantFoyer")
    private int idFoyer;

    private String nomFoyer;
    private long capaciteFoyer;


    @OneToOne(mappedBy="foyer")
    private Universite universite;

    @OneToMany(mappedBy = "foyer")
    List<Bloc> blocs;

}
