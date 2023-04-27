package com.driver;

public class MaxWithdrawLimitException extends RuntimeException{
    public MaxWithdrawLimitException()
    {
        super("Maximum Withdraw Limit Exceed");
    }
}
