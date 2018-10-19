package be.chirozonhovencentrum.christmas.orderservices.services.customer;

import be.chirozonhovencentrum.christmas.orderservices.model.Customer;

public interface CustomerService {

    Customer saveOrUpdateCustomer(Customer customer);

    Customer findCustomerById(Long id);
}
