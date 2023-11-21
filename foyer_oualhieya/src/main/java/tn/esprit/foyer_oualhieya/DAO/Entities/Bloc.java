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

public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identifiantBloc")
    private int idBloc;

    private String nomBloc;

    private long capaciteBloc;

    @ManyToOne
    Foyer foyer;

    @OneToMany(mappedBy = "bloc")
    List<Chambre> chambres;
}
