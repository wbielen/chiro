package be.chirozonhovencentrum.christmas.orderservices.controllers;

import be.chirozonhovencentrum.christmas.orderservices.model.TimeInterval;
import be.chirozonhovencentrum.christmas.orderservices.services.timeinterval.TimeIntervalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/timeintervals")
public class TimeIntervalController {

    @Autowired
    private TimeIntervalService timeIntervalService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TimeInterval> getAllTimeIntervals() {
        return timeIntervalService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TimeInterval createTimeInterval(@Valid @RequestBody TimeInterval timeInterval) {
        return timeIntervalService.saveOrUpdateTimeInterval(timeInterval);
    }

    @PutMapping("/{timeIntervalId}")
    @ResponseStatus(HttpStatus.OK)
    public TimeInterval updateTimeInterval(@Valid @RequestBody TimeInterval timeInterval, @PathVariable Long timeIntervalId) {
        timeInterval.setId(timeIntervalId);
        return timeIntervalService.saveOrUpdateTimeInterval(timeInterval);
    }

    @GetMapping("/{timeIntervalId}")
    @ResponseStatus(HttpStatus.OK)
    public TimeInterval getTimeInterval(@PathVariable Long timeIntervalId) {
        return timeIntervalService.findTimeIntervalById(timeIntervalId);
    }

    @DeleteMapping("/{timeIntervalId}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteTimeInterval(@PathVariable Long timeIntervalId) {
        timeIntervalService.deleteTimeIntervalById(timeIntervalId);
    }

}
