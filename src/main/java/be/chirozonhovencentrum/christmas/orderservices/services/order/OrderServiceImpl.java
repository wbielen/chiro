package be.chirozonhovencentrum.christmas.orderservices.services.order;

import be.chirozonhovencentrum.christmas.orderservices.exceptions.OrderNotFoundException;
import be.chirozonhovencentrum.christmas.orderservices.model.BreakfastOrder;
import be.chirozonhovencentrum.christmas.orderservices.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public BreakfastOrder saveOrUpdateOrder(BreakfastOrder breakfastOrder) {
        return orderRepository.save(breakfastOrder);
    }

    @Override
    public BreakfastOrder findBreakfastOrderById(Long id) {
        return orderRepository.findById(id).orElseThrow(OrderNotFoundException::new);
    }
}
