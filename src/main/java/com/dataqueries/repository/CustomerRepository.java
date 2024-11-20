package com.dataqueries.repository;

import com.dataqueries.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    /// Write a derived query to get customer by username
    List<Customer> findByUserName(String username);

    /// Write a JPQL query to get customer by email
    @Query("Select c from Customer c Where c.email=?1")
    Optional<Customer> retrieveCustomerByEmail(String email);
}
