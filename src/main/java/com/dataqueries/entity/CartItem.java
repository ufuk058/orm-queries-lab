package com.dataqueries.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Data
public class CartItem  extends BaseEntity{

    private Integer quantity;

    @ManyToOne
    private Cart cart;

    @ManyToOne
    private Product product;
}
