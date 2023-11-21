package tn.esprit.foyer_oualhieya.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer_oualhieya.DAO.Entities.Etudiant;


public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
}
