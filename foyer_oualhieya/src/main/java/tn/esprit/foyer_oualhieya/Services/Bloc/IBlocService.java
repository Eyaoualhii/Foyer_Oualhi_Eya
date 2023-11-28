package tn.esprit.foyer_oualhieya.Services.Bloc;

import tn.esprit.foyer_oualhieya.DAO.Entities.Bloc;

import java.util.List;
import java.util.Optional;

public interface IBlocService {

    List<Bloc> getBlocsList();
    public Bloc getBlocById(int id);
    public Bloc createBloc(Bloc bloc);
    public void deleteBloc(int id);

    public Bloc updateBloc(Bloc b);
}
