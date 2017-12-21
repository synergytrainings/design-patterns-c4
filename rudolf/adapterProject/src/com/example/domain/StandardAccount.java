package com.example.domain;

/**
 * @author rudolf.shakhgaldyan on 12/18/2017
 */
public class StandardAccount extends Account{

    public StandardAccount(final double balance) {
        super(balance);
        setOverdraftAvailable(false);
    }
}
