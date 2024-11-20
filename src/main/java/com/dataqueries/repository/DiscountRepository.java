package com.dataqueries.repository;

import com.dataqueries.entity.Discount;
import com.dataqueries.enums.DiscountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface DiscountRepository extends JpaRepository<Discount,Long> {

    /// Write a derived query to get all discounts greater than discount amount
    List<Discount> findAllByDiscountGreaterThan(BigDecimal discount);

    /// Write a derived query to get all discounts by specific discount type
    List<Discount> findAllByDiscountType(DiscountType discountType);

    ///Write a jpql query to get all discounts with the discount amount between given range
    @Query("Select d from Discount d where d.discount between ?1 AND ?2")
    List<Discount> retrieveAllDiscountBetween(BigDecimal amount1,BigDecimal amount2);

}
