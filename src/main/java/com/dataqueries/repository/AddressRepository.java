package com.dataqueries.repository;

import com.dataqueries.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {

    //Write a derived query to get all addresses starting with streetName
    List<Address> findByStreetStartsWith(String streetName);

    //Display all addresses with specific CustomerId
    List<Address> findByCustomerId(int customerId);

    //Display address with a specific customer id in JPQL
    @Query("Select a from Address a where a.customer.id= ?1")
    List<Address> retrieveAddressWithCustomerId(int customer_id);
}
