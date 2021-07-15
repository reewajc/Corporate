package com.company;
/*
Author: Ram Chapagai
Date: 07/08/2021
Assignment: 7.1
Description: InternationalDivision class derived from Division class
company: Bellevue University
 */
public class InternationalDivision extends Division {
    //Fields
   private String locatedCountry;
   private String languageSpoken;

    //Constructor
    public InternationalDivision(String accountName, String accountNumber, String locatedCountry, String languageSpoken) {
        super(accountName, accountNumber);
        this.locatedCountry = locatedCountry;
        this.languageSpoken = languageSpoken;
    }

    @Override
    public String toString() {
        return "InternationalDivision info: " +
                "accountName='" + accountName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", locatedCountry='" + locatedCountry + '\'' +
                ", languageSpoken='" + languageSpoken + '\'' ;
    }

    //display method implementation
    @Override
    void display() {
        System.out.println(this);
    }
}
