package com.company;

/*
Author: Ram Chapagai
Date: 07/11/2021
Assignment: 7.1
Description: Corporate class that instantiate two instance of DomesticDivision and two instance of InternationalDivision
 company: Bellevue University
 */
public class Corporate {

    public static void main(String[] args) {
        //Create instance of DomesticDivision
        DomesticDivision domesticDivision = new DomesticDivision("Microsoft-NorthEast", "NE5678JHYFGHR4","South Dakota");
        DomesticDivision domesticDivision1 = new DomesticDivision("Microsoft-MiddleEast", "ME5678JHYFGH55","IOWA");

        //Create instance of InternationalDivision
        InternationalDivision internationalDivision = new InternationalDivision("Microsoft-Asia", "ASIIII9996887", "India", "Hindi");
        InternationalDivision internationalDivision1 = new InternationalDivision("Microsoft-Europe", "EUIIII9996887", "Germany", "Dutch");

        //Display information
        domesticDivision.display();
        domesticDivision1.display();
        internationalDivision.display();
        internationalDivision1.display();

    }


}
