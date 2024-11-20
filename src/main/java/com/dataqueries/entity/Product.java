package com.dataqueries.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Product extends BaseEntity{

    private String name;
    private BigDecimal price;
    private int quantity;
    private int remainingQuantity;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "product_category_rel",joinColumns = @JoinColumn(name="p_id"),
            inverseJoinColumns=@JoinColumn(name="c_id"))
    private List<Category> categoryList;
}
