package be.chirozonhovencentrum.christmas.orderservices.services.timeinterval;

import be.chirozonhovencentrum.christmas.orderservices.exceptions.TimeIntervalNotFoundException;
import be.chirozonhovencentrum.christmas.orderservices.model.TimeInterval;
import be.chirozonhovencentrum.christmas.orderservices.repository.TimeIntervalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeIntervalServiceImpl implements TimeIntervalService {

    @Autowired
    private TimeIntervalRepository timeIntervalRepository;


    @Override
    public TimeInterval saveOrUpdateTimeInterval(TimeInterval timeInterval) {
        return timeIntervalRepository.save(timeInterval);
    }

    @Override
    public TimeInterval findTimeIntervalById(Long id) {
        return timeIntervalRepository.findById(id).orElseThrow(TimeIntervalNotFoundException::new);
    }

    @Override
    public List<TimeInterval> findAll() {
        return timeIntervalRepository.findAll();
    }

    @Override
    public void deleteTimeIntervalById(Long id) {
        timeIntervalRepository.deleteById(id);
    }
}
