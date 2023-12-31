package tn.esprit.foyer_oualhieya.Services.Bloc;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import tn.esprit.foyer_oualhieya.DAO.Entities.Bloc;
import tn.esprit.foyer_oualhieya.DAO.Repository.BlocRerpository;
import java.util.List;
import java.util.Optional;

@Service // definir cest un bean Spring
@AllArgsConstructor // on va utiliser methode constructeur au lieu de @autowired ou @inject
public class BlocService implements IBlocService{

    BlocRerpository blocRepo;

    @Override
    public List<Bloc> getBlocsList() {
        return blocRepo.findAll();
    }

//    @Override
//    public Optional<Bloc> getBlocById(int id) {
//        return blocRepo.findById(id);
//    }
@Override
    public Bloc getBlocById(int id) {
    return blocRepo.findById(id).orElse(Bloc.builder().idBloc(0).nomBloc("bloc1").capaciteBloc(0).build());
}
    @Override
    public Bloc createBloc(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public void deleteBloc(int id) {
        blocRepo.deleteById(id);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepo.save(b);
    }




}
