package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Persons {
    public static String name, lastname, street, city, zipCode;
    public static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    public static void Initialize() throws IOException {
        System.out.print("Enter your name: ");
        name = BR.readLine();
        System.out.print("Enter your last name: ");
        lastname = BR.readLine();
        System.out.print("Enter your street: ");
        street = BR.readLine();
        System.out.print("Enter your city: ");
        city = BR.readLine();
        System.out.print("Enter your zipCode: ");
        zipCode = BR.readLine();
    }

    public static void Print() {
        System.out.println(String.format("Name: %s , Lastname: %s , " +
                "Street: %s , City: %s , Zipcode: %s", name, lastname, street, city, zipCode));
    }

    public abstract void SalariesToPay(int hour, int rate);
}

