package tn.esprit.foyer_oualhieya.Controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer_oualhieya.DAO.Entities.Chambre;
import tn.esprit.foyer_oualhieya.DAO.Entities.Etudiant;
import tn.esprit.foyer_oualhieya.DAO.Entities.Foyer;
import tn.esprit.foyer_oualhieya.Services.Foyer.FoyerService;
import tn.esprit.foyer_oualhieya.Services.Foyer.IFoyerService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/foyers")
public class FoyerController {

    IFoyerService foyerService;



    @GetMapping
    public List<Foyer> getFoyersList() {
        return foyerService.getFoyersList();

    }

    @GetMapping("/{id}")
    public Optional<Foyer> getFoyerById(@PathVariable int id) {
        return  foyerService.getFoyerById(id);

    }

    @PostMapping
    public Foyer createFoyer(@RequestBody Foyer foyer) {
        return  foyerService.createFoyer(foyer);


    }
    @DeleteMapping("/{id}")
    public void deleteFoyer(@PathVariable int id) {
        foyerService.deleteFoyer(id);
    }




    @PutMapping
    public void updateFoyer(@RequestBody Foyer f) {
        foyerService.updateFoyer(f);
    }
}
