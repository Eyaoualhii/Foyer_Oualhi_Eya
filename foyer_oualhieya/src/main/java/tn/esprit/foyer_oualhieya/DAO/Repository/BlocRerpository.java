package tn.esprit.foyer_oualhieya.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.foyer_oualhieya.DAO.Entities.Bloc;
import tn.esprit.foyer_oualhieya.DAO.Entities.Universite;

import java.util.List;

public interface BlocRerpository extends JpaRepository<Bloc,Integer> {
    // equivalent select * from Bloc where nomBloc=

    Bloc findByNomBloc(String nomBloc);
    //ou
    Bloc getByNomBloc(String nomBloc);

    //select * from bloc where nomBloc = and capaciteBloc=
    List<Bloc> findByNomBlocAndCapaciteBloc(String nomBloc,long capaciteBloc);

    Bloc findByNomBlocIgnoreCase(String nomBloc);
    Bloc findByCapaciteBlocGreaterThan(long capaciteBloc);
    List<Bloc> findByNomBlocOrderByNomBloc(String nomBloc);

    //select * from bloc where nomBloc = or capaciteBloc=
    Bloc findByNomBlocOrCapaciteBloc(String nomBloc,long capaciteBloc);
    Bloc findByFoyerUniversite(Universite universite);


}
