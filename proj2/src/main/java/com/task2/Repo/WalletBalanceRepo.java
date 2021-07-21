package com.task2.Repo;

import com.task2.Entity.Walletbalance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletBalanceRepo extends CrudRepository<Walletbalance,String> {
}
