package com.driver;

public class CannotGenerateAccountNumberException extends RuntimeException{
    public CannotGenerateAccountNumberException()
    {
        super("Account Number can not be generated");
    }
}
