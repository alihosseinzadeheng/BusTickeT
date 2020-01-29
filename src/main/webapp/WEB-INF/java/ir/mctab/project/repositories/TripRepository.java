package ir.mctab.project.repositories;

import ir.mctab.project.config.repositories.CrudRepository;
import ir.mctab.project.entities.TripList;


public class TripRepository extends CrudRepository<TripList, Long> {

    public static TripRepository getInstance() {
        return new TripRepository();
    }

    @Override
    protected Class<TripList> getEntityClass() {
        return TripList.class;
    }
}