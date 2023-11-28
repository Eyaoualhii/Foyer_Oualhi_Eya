package tn.esprit.foyer_oualhieya.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer_oualhieya.DAO.Entities.Bloc;
import tn.esprit.foyer_oualhieya.DAO.Entities.Universite;
import tn.esprit.foyer_oualhieya.Services.Universite.UniversiteService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/universites")
public class UniversiteController {
    UniversiteService universiteService;


    @GetMapping
    public List<Universite> getUniversitesList() {
        return universiteService.getUniversitesList();

    }

    @GetMapping("/{id}")
    public Optional<Universite> getUniversiteById(@PathVariable int id) {
        return  universiteService.getUniversiteById(id);

    }

    @PostMapping
    public Universite createUniversite(@RequestBody Universite universite) {
        return  universiteService.createUniversite(universite);


    }
    @DeleteMapping("/{id}")
    public void deleteUniversite(@PathVariable int id) {
        universiteService.deleteUniversite(id);
    }

}
