package com.example.adapter;

import com.example.adaptee.OffshoreAccount;
import com.example.domain.Account;

/**
 * @author rudolf.shakhgaldyan on 12/18/2017
 */
public class AccountAdapter extends Account {
    private double balance;

    private OffshoreAccount offshoreAccount;

    public AccountAdapter(OffshoreAccount offshoreAccount) {
        super(offshoreAccount.getOffshoreBalance());
        this.offshoreAccount = offshoreAccount;

        double taxRate = offshoreAccount.getTaxRate();
        double grossBalance = offshoreAccount.getOffshoreBalance();

        double taxableBalance = grossBalance * taxRate;
        double balanceAfterTax = grossBalance - taxableBalance;
        this.balance = balanceAfterTax;

    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public boolean isOverdraftAvailable() {
        return !super.isOverdraftAvailable();
    }
}
