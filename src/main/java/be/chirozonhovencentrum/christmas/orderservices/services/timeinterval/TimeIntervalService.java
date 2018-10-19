package be.chirozonhovencentrum.christmas.orderservices.services.timeinterval;

import be.chirozonhovencentrum.christmas.orderservices.model.TimeInterval;

import java.util.List;

public interface TimeIntervalService {

    TimeInterval saveOrUpdateTimeInterval(TimeInterval timeInterval);

    TimeInterval findTimeIntervalById(Long id);

    List<TimeInterval> findAll();

    void deleteTimeIntervalById(Long id);
}
