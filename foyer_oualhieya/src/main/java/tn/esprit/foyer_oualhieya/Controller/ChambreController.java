package tn.esprit.foyer_oualhieya.Controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer_oualhieya.DAO.Entities.Bloc;
import tn.esprit.foyer_oualhieya.DAO.Entities.Chambre;
import tn.esprit.foyer_oualhieya.Services.Bloc.IBlocService;
import tn.esprit.foyer_oualhieya.Services.Chambre.ChambreService;
import tn.esprit.foyer_oualhieya.Services.Chambre.IChambreService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/chambres")
public class ChambreController {
    IChambreService chambreService;


    @GetMapping
    public List<Chambre> getChambresList() {
        return chambreService.getChambresList();

    }

    @GetMapping("/{id}")
    public Optional<Chambre> getChambreById(@PathVariable int id) {
        return  chambreService.getChambreById(id);

    }

    @PostMapping
    public Chambre createChambre(@RequestBody Chambre chambre) {
        return  chambreService.createChambre(chambre);


    }
    @DeleteMapping("/{id}")
    public void deleteChambre(@PathVariable int id) {
        chambreService.deleteChambre(id);
    }


    @PutMapping
    public void updateBloc(@RequestBody Chambre c) {
        chambreService.updateChambre(c);
    }
}
