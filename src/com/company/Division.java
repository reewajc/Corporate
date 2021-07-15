package com.company;
/*
Author: Ram Chapagai
Date: 07/08/2021
Assignment: 7.1
Description: Abstract class Division
company: Bellevue University
 */
public abstract class Division {
    //Fields
   protected String accountName,accountNumber;
 //Constructor
    public Division(String accountName, String accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }
//Abstract method
    abstract void display();
}
