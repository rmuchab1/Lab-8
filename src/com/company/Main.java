package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    public static Staff staff = new Staff();
    static int hour = 8, rate = 50, yearsOfExp = 4,
            overtime = 3, overtimeRate = 60;

    public static void main(String[] args) throws IOException, NumberFormatException {
        Staffs.StaffInitialize();
        Staffs.StaffPrint();
        staff.SalaryToPay(hour, rate);
        staff.SalaryOvertime(overtime, overtimeRate);
        Salary.IsBonus(yearsOfExp);
    }
}
