package com.company;
import java.util.Scanner ;

public interface Salary {
    static void IsBonus(int yearsOfExp) {
    }

    default  int SalaryOverTime(int hours  , int rate ) {

        return hours*rate;
    }

    class SalaryToPay  Salary {
        int hours , rate ;


        return hours * rate;}

}

class SalaryToPayimplements<rate, hours> Salary {
    int hours , rate ;

        return hours * rate;}
