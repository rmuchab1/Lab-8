package com.company;

public class Person {
package com.company;

import java.util.Scanner;

    public class Person {


        Scanner sr = new Scanner(System.in);
        String surnamemuchie56850 , firstNamerobert56850, street56850 , city56850;
        int zipCode56850;

        void Initialize(){
            System.out.println("Please enter your Name: ");
            firstNamerobert56850 = sr.nextLine();
            System.out.println("Please enter your Surname: ");
            surnamemuchie56850 = sr.nextLine();
            System.out.println("Please enter your Street name: ");
            street56850 = sr.nextLine();
            System.out.println("Please enter your City: ");
            city56850 = sr.nextLine();
            System.out.println("Please enter your Zip Code: ");
            zipCode56850 = sr.nextInt();
        }

        void printData(){
            System.out.println("Name: "+ firstNamerobert56850);
            System.out.println("Surname: "+ surnamemuchie56850);
            System.out.println("Street Name: "+ street56850);
            System.out.println("City: "+ city56850);
            System.out.println("Zip Code: "+ zipCode56850);
        }

    }

