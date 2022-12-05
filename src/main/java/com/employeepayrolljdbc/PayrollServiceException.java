package com.employeepayrolljdbc;

public class PayrollServiceException extends Exception{
    enum ExceptionType{
        CONNECTION_PROBLEM, RETRIEVAL_PROBLEM,UPDATE_PROBLEM;;
    }

    ExceptionType type;
    PayrollServiceException(String msg, ExceptionType type){
        super(msg);
        this.type = type;
    }
}
