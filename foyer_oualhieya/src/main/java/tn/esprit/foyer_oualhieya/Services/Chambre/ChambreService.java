package tn.esprit.foyer_oualhieya.Services.Chambre;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_oualhieya.DAO.Entities.Chambre;
import tn.esprit.foyer_oualhieya.DAO.Repository.ChambreRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService{

    ChambreRepository chambrerepo;


    public List<Chambre> getChambresList() {
        return null;
    }
}
