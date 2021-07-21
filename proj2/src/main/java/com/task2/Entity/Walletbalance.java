package com.task2.Entity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wallet_balance")
@Data
public class Walletbalance {
    @Id
    private String customer_id;
    private int balance;
}
