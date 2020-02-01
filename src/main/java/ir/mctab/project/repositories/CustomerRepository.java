package ir.mctab.project.repositories;

import ir.mctab.project.config.repositories.CrudRepository;
import ir.mctab.project.entities.Customer;

public class CustomerRepository extends CrudRepository<Customer, Long> {

    public static CustomerRepository getInstance(){
        return new CustomerRepository();
    }
    @Override
    protected Class<Customer> getEntityClass() {
        return Customer.class;
    }
}
