package com.dataqueries.repository;

import com.dataqueries.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;

public interface PaymentRepository extends JpaRepository<Payment,Long> {

    /// Write a native query to find the total sum of all payments made
    @Query(value = "Select SUM(paid_price) from Payment", nativeQuery = true)
    BigDecimal retrievePaidPriceSum();

    /// Write a native query to find average amount paid for all payments
    @Query(value = "Select AVG(paid_price) from Payment", nativeQuery = true)
    BigDecimal retrieveAveragePaidPrice();
}
