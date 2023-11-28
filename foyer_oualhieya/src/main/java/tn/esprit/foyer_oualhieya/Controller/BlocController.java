package tn.esprit.foyer_oualhieya.Controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer_oualhieya.DAO.Entities.Bloc;
import tn.esprit.foyer_oualhieya.Services.Bloc.IBlocService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/blocs")
public class BlocController {
    IBlocService blocService;


    @GetMapping
    public List<Bloc> getBlocsList() {
        return blocService.getBlocsList();

    }

//    @GetMapping("/{id}")
//    public Optional<Bloc> getBlocById(@PathVariable int id) {
//        return  blocService.getBlocById(id);
//
//    }

    @PostMapping
    public Bloc createBloc(@RequestBody Bloc bloc) {
        return  blocService.createBloc(bloc);


    }
    @DeleteMapping("/{id}")
    public void deleteBloc(@PathVariable int id) {
        blocService.deleteBloc(id);
    }
    @PutMapping
    public void updateBloc(@RequestBody Bloc b) {
        blocService.updateBloc(b);
    }

}




