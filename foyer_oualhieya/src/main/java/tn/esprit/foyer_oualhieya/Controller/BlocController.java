package tn.esprit.foyer_oualhieya.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer_oualhieya.DAO.Entities.Bloc;
import tn.esprit.foyer_oualhieya.Services.Bloc.BlocService;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/blocs")
public class BlocController {
    public final BlocService blocService;

    public BlocController(BlocService blocService) {
        this.blocService = blocService;
    }

    @GetMapping
    public ResponseEntity<List<Bloc>> getBlocsList() {
        List<Bloc> blocs = blocService.getBlocsList();
        return ResponseEntity.ok(blocs);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Bloc> getBlocById(@PathVariable int id) {
        Optional<Bloc> bloc = blocService.getBlocById(id);
        return bloc.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBloc(@PathVariable int id) {
        blocService.deleteBloc(id);
        return ResponseEntity.noContent().build();
    }


    @PostMapping
    public String createBloc( Bloc bloc) {
        blocService.createBloc(bloc);
        return "redirect:/blocs";
    }


}
