package com.dataqueries.repository;

import com.dataqueries.entity.CartItem;
import com.dataqueries.enums.CartState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

    ///(Derived) Display count of all cart items
    Integer countAllBy();


    /// (Derived) Get all cart items with specific cart_status
    List<CartItem> findAllByCart_CartState(CartState CartState);

    /// (Native) get all cart items wit specific cart state and product Name
//    @Query(value = "SELECT * FROM cart_item ci JOIN cart c " +
//            "ON ci.cart_id=c.id JOIN product p ON ci.product_id=p.id " +
//            "WHERE c.cart_state=?1 AND p.name=?2", nativeQuery = true)
//    List<CartItem> retrieveCartItemsByCartStateAndProductName(String cartState, String name);

    ///(Native) get cart items for specific cart state and without discount
//    @Query(value = "SELECT * FROM cart_item ci JOIN cart c " +
//            "ON ci.cart_id=c.id WHERE c.cart_state=?1 AND " +
//            "c.discount_id IS NULL", nativeQuery = true)
//    List<CartItem> retrieveCartItemsByCartStateWithoutDiscount(String cardState);



}
