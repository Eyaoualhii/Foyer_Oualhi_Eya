package tn.esprit.foyer_oualhieya.Controller;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer_oualhieya.DAO.Entities.Chambre;
import tn.esprit.foyer_oualhieya.DAO.Entities.Etudiant;
import tn.esprit.foyer_oualhieya.Services.Chambre.IChambreService;
import tn.esprit.foyer_oualhieya.Services.Etudiant.EtudiantService;
import tn.esprit.foyer_oualhieya.Services.Etudiant.IEtudiantService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiants")
public class EtudiantController {

    IEtudiantService etudiantService;



    @GetMapping
    public List<Etudiant> getEtudiantsList() {
        return etudiantService.getEtudiantsList();

    }

    @GetMapping("/{id}")
    public Optional<Etudiant> getEtudiantById(@PathVariable int id) {
        return  etudiantService.getEtudiantById(id);

    }

    @PostMapping
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
        return  etudiantService.createEtudiant(etudiant);


    }
    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable int id) {
        etudiantService.deleteEtudiant(id);
    }


    @PutMapping
    public void updateEtudiant(@RequestBody Etudiant e) {
        etudiantService.updateEtudiant(e);
    }
}
