package be.chirozonhovencentrum.christmas.orderservices.controllers;

import be.chirozonhovencentrum.christmas.orderservices.model.Customer;
import be.chirozonhovencentrum.christmas.orderservices.services.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer createCustomer(@Valid @RequestBody Customer customer) {
        return customerService.saveOrUpdateCustomer(customer);
    }

    @PutMapping("/{customerId}")
    @ResponseStatus(HttpStatus.OK)
    public Customer updateCustomer(@Valid @RequestBody Customer customer, @PathVariable Long customerId) {
        customer.setId(customerId);
        return customerService.saveOrUpdateCustomer(customer);
    }

    @GetMapping("/{customerId}")
    @ResponseStatus(HttpStatus.OK)
    public Customer getCustomer(@PathVariable Long customerId) {
        return customerService.findCustomerById(customerId);
    }

}
