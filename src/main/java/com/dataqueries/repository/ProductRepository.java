package com.dataqueries.repository;

import com.dataqueries.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    /// Write a derived query to get product by specific name
    Product findFirstByName(String name);


    /// Write a derived query to get the count of products that have a price greater than specific amount
    Integer countProductByPriceGreaterThan(BigDecimal price);

}
