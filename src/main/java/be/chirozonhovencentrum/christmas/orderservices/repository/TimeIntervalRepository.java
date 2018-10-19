package be.chirozonhovencentrum.christmas.orderservices.repository;

import be.chirozonhovencentrum.christmas.orderservices.model.TimeInterval;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TimeIntervalRepository extends CrudRepository<TimeInterval, Long> {

    TimeInterval save(TimeInterval timeInterval);

    Optional<TimeInterval> findById(Long id);

    List<TimeInterval> findAll();

    void deleteById(Long id);
}
