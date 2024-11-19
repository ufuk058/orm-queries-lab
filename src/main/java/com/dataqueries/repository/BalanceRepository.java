package com.dataqueries.repository;

import com.dataqueries.entity.Balance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BalanceRepository extends JpaRepository<Balance,Long> {
    //Write a native query to get top 5 max balance
    List<Balance> findTop5ByBalance();
}
