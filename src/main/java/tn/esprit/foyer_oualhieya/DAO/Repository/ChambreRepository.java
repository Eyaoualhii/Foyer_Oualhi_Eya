package tn.esprit.foyer_oualhieya.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer_oualhieya.DAO.Entities.Chambre;


public interface ChambreRepository extends JpaRepository<Chambre,Integer> {
}
