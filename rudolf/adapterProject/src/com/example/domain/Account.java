package com.example.domain;

/**
 * @author rudolf.shakhgaldyan on 12/18/2017
 */
public abstract class Account {
    private double balance;
    private boolean isOverdraftAvailable;

    public Account(final double size) {
        this.balance = size;
    }

    public void credit(final double credit) {
        balance += credit;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isOverdraftAvailable() {
        return isOverdraftAvailable;
    }

    public void setOverdraftAvailable(boolean isOverdraftAvailable) {
        this.isOverdraftAvailable = isOverdraftAvailable;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " Balance=" + getBalance()
                + " Overdraft:" + isOverdraftAvailable();
    }
}
