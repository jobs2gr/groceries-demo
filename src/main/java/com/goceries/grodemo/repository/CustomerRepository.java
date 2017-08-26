package com.goceries.grodemo.repository;

import com.goceries.grodemo.domain.Customer;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by developer on 8/26/17.
 */
public interface CustomerRepository extends Repository<Customer,Long> {
    List<Customer> findAll();
}
