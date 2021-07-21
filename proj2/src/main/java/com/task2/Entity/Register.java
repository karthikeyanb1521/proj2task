package com.task2.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_data")
@Data
public class Register {

    @Id
    private String customer_id;
    private String first_name;
    private String last_name;
    private String address;
    private String salutation;
}
