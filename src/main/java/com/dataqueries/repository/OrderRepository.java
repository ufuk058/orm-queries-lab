package com.dataqueries.repository;

import com.dataqueries.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {

    /// Write a derived query to get top 5 orders which are ordered by total price
    List<Order> findTop5ByOrderByTotalPrice();


    ///Write a derived query to check is there any orders by customer email
    boolean existsByCustomerEmail(String email);


    /// Write JPQL query to get all orders that have equal total price and paid price
    @Query("Select o from Order o Where o.paidPrice=o.totalPrice")
    List<Order> retrieveAllOrdersTotalPriceAndPaidPrice();
}
