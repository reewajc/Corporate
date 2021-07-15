package com.company;

/*
Author: Ram Chapagai
Date: 07/08/2021
Assignment: 7.1
Description: DomesticDivision class inherited from Division
company: Bellevue University

 */
public class DomesticDivision extends Division {
   private String locatedState;

    public DomesticDivision(String accountName, String accountNumber, String locatedState) {
        super(accountName, accountNumber);
        this.locatedState = locatedState;
    }

    //Display method
    @Override
    void display() {
        System.out.println(this);
    }//No need to specify this.toString()

    @Override
    public String toString() {
        return "DomesticDivision info:" +
                "accountName='" + accountName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", locatedState='" + locatedState + '\'';
    }
}


