package com.example.adaptee;

/**
 * @author rudolf.shakhgaldyan on 12/18/2017
 */
public class OffshoreAccount {
    private double balance;

    private static final double TAX_RATE = 0.04;

    public OffshoreAccount(final double balance) {
        this.balance = balance;
    }

    public double getTaxRate() {
        return TAX_RATE;
    }

    public double getOffshoreBalance() {
        return balance;
    }

    public void debit(final double debit) {
        if (balance >= debit) {
            balance -= debit;
        }
    }

    public void credit(final double credit) {
        balance += credit;
    }
}
