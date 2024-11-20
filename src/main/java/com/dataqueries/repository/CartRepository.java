package com.dataqueries.repository;

import com.dataqueries.entity.Cart;
import com.dataqueries.enums.DiscountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart,Long> {

    /// (Derived) display all cart by specific discount
    List<Cart> findAllByDiscount_DiscountType(DiscountType discountType);

    /// Display all Cart by customer with JPQL
    @Query("Select c from Cart c Where c.customer.id=?1")
    List<Cart> retrieveCartListByCustomer(Long customerId);
}
