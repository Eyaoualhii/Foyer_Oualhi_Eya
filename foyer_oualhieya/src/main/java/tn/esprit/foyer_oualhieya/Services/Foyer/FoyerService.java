package tn.esprit.foyer_oualhieya.Services.Foyer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_oualhieya.DAO.Repository.FoyerRepository;
@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService{

    FoyerRepository foyerrepo;


}
