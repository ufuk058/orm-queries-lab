package com.dataqueries.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Category extends BaseEntity{

    public Category(String name) {
        this.name = name;
    }

    private String name;



}
