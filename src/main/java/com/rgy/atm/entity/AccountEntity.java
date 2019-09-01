package com.rgy.atm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(schema = "atm", name = "account")
public class AccountEntity extends BaseEntity implements Serializable {

    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @Column(name = "account_type", nullable = false)
    private String accountType;

    @Column(name = "balance", nullable = false)
    private Float balance;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
}
