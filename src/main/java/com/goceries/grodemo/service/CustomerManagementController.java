package com.goceries.grodemo.service;

import com.goceries.grodemo.domain.Customer;
import com.goceries.grodemo.repository.CustomerRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@Transactional
@RequestMapping("/customers")
public class CustomerManagementController {
    private static Logger logger = Logger.getLogger(CustomerManagementController.class);

    @Autowired
    private CustomerRepository customerRepository;


    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public @ResponseBody List<Customer> allCustomers() {
        return customerRepository.findAll();
    }
}