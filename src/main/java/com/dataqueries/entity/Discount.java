package com.dataqueries.entity;

import com.dataqueries.enums.DiscountType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Data
public class Discount extends  BaseEntity {


    private String name;
    private BigDecimal discount;
    @Enumerated(EnumType.STRING)
    private DiscountType discountType;
}
