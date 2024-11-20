package com.dataqueries.repository;

import com.dataqueries.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    /// Write derived Query to get category by name
    List<Category> findByName(String name);

    /// Write a derived query to get top 3 categories order by name desc
    List<Category> findTop3ByOrderByNameDesc();
}
