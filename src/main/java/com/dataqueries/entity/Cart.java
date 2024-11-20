package com.dataqueries.entity;

import com.dataqueries.enums.CartState;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Data
public class Cart extends BaseEntity{


    @Enumerated(EnumType.STRING)
    private CartState cartState;

    @ManyToOne
    private Discount discount;

    @ManyToOne
    private Customer customer;


}
