package tn.esprit.foyer_oualhieya.DAO.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Chambre {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identifiantChambre")
    private long idChambre;
    private long numeroChambre;
    private TypeChambre typeC;

    @ManyToOne
    Bloc bloc;


    @OneToMany
    List<Reservation> reservations;

}
