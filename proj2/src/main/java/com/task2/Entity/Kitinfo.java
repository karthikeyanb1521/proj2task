package com.task2.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kit_data")
@Data
public class Kitinfo {
    @Id
    private int kit_number;
    private String kit_status;
    private String customer_id;
}
