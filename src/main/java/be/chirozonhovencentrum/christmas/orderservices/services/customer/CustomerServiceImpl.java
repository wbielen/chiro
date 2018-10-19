package be.chirozonhovencentrum.christmas.orderservices.services.customer;

import be.chirozonhovencentrum.christmas.orderservices.exceptions.CustomerNotFoundException;
import be.chirozonhovencentrum.christmas.orderservices.model.Customer;
import be.chirozonhovencentrum.christmas.orderservices.repository.CustomerRepository;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private static EmailValidator emailValidator = EmailValidator.getInstance();

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer saveOrUpdateCustomer(Customer customer) {
        if (emailValidator.isValid(customer.getEmailAddress())) {
            return customerRepository.save(customer);
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).orElseThrow(CustomerNotFoundException::new);
    }
}
