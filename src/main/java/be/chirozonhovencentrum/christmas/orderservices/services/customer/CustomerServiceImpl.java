package be.chirozonhovencentrum.christmas.orderservices.services.customer;

import be.chirozonhovencentrum.christmas.orderservices.exceptions.CustomerNotFoundException;
import be.chirozonhovencentrum.christmas.orderservices.model.Customer;
import be.chirozonhovencentrum.christmas.orderservices.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer saveOrUpdateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).orElseThrow(CustomerNotFoundException::new);
    }
}
