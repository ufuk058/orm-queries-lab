package com.dataqueries.repository;

import com.dataqueries.entity.Balance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BalanceRepository extends JpaRepository<Balance,Long> {
    /// (Native) Write a native query to get top 5 max balance
   @Query(value = "Select * from Balance Order By amount Desc Limit 5",nativeQuery = true)
    List<Balance> retrieveTop5Amount();


    /// (Derived) Display all balances greater than or equal to a specific balance amount
    @Query("Select b from Balance  b where b.amount >= ?1")
    List<Balance> retrieveBalanceGreaterThanOrEqual(int balanceAmount);

    /// (Native) Display all balances less than specific balance amount with native query
    @Query(value = "Select * from Balance where amount<=?1",nativeQuery = true)
    List<Balance> retrieveBalanceLessThan(int amount);
}
