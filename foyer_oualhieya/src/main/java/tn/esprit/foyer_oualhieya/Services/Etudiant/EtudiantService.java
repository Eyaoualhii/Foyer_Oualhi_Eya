package tn.esprit.foyer_oualhieya.Services.Etudiant;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer_oualhieya.DAO.Repository.EtudiantRepository;
@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{

    EtudiantRepository etudiantrepo;


}
