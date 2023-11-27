package tn.esprit.foyer_oualhieya.Services.Universite;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_oualhieya.DAO.Repository.UniversiteRepository;
@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService{

    UniversiteRepository universiterepo;


}
