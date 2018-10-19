package be.chirozonhovencentrum.christmas.orderservices.controllers;

import be.chirozonhovencentrum.christmas.orderservices.model.BreakfastOrder;
import be.chirozonhovencentrum.christmas.orderservices.services.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BreakfastOrder createBreakfastOrder(@Valid @RequestBody BreakfastOrder breakfastOrder) {
        return orderService.saveOrUpdateOrder(breakfastOrder);
    }

    @PutMapping("/{orderId}")
    @ResponseStatus(HttpStatus.OK)
    public BreakfastOrder updateBreakfastOrder(@Valid @RequestBody BreakfastOrder breakfastOrder, @PathVariable Long orderId) {
        breakfastOrder.setId(orderId);
        return orderService.findBreakfastOrderById(orderId);
    }

    @GetMapping("/{orderId}")
    @ResponseStatus(HttpStatus.OK)
    public BreakfastOrder getBreakfastOrder(@PathVariable Long orderId) {
        return orderService.findBreakfastOrderById(orderId);
    }
}
