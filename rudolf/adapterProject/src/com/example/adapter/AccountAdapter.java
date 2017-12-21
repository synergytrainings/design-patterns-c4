package com.example.adapter;

import com.example.adaptee.OffshoreAccount;
import com.example.domain.Account;

/**
 * @author rudolf.shakhgaldyan on 12/18/2017
 */
public class AccountAdapter extends Account {


    private OffshoreAccount offshoreAccount;

    public AccountAdapter(OffshoreAccount offshoreAccount) {
        super(offshoreAccount.getOffshoreBalance());

        // holds adaptee reference
        this.offshoreAccount = offshoreAccount;
    }


    @Override
    public double getBalance() {
        double taxRate = offshoreAccount.getTaxRate();
        double grossBalance = offshoreAccount.getOffshoreBalance();

        double taxableBalance = grossBalance * taxRate;
        double balanceAfterTax = grossBalance - taxableBalance;
        return balanceAfterTax;
    }
}
