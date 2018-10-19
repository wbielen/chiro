package be.chirozonhovencentrum.christmas.orderservices.repository;

import be.chirozonhovencentrum.christmas.orderservices.model.BreakfastOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends CrudRepository<BreakfastOrder, Long> {

    BreakfastOrder save(BreakfastOrder breakfastOrder);

    Optional<BreakfastOrder> findById(Long id);

}
