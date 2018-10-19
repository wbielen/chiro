package be.chirozonhovencentrum.christmas.orderservices.services.order;

import be.chirozonhovencentrum.christmas.orderservices.model.BreakfastOrder;

public interface OrderService {

    BreakfastOrder saveOrUpdateOrder(BreakfastOrder breakfastOrder);

    BreakfastOrder findBreakfastOrderById(Long id);


}
