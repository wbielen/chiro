package be.chirozonhovencentrum.christmas.orderservices.repository;

import be.chirozonhovencentrum.christmas.orderservices.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer save(Customer customer);

    Optional<Customer> findById(Long id);

}
