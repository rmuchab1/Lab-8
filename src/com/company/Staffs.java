package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Salaries {
    void SalaryToPay(int hour, int rate);

    default void SalaryOvertime(int hour, int rate) {
        int total = rate * hour;
        System.out.println("Salary overtime: " + total);
}
    static void IsBonus(int yearsOfExp) {
        String result = yearsOfExp > 5 ? "Bonus $550 per month" : "No bonus";
        System.out.println("Bonus: " + result);
    }
}
    class Staffs extends Persons implements Salary {
        public static String education, position;
        public static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

        public static void StaffsInitialize() throws IOException {
            Persons.Initialize();
            System.out.print("Enter education: ");
            education = BR.readLine();
            System.out.print("Enter position: ");
            position = BR.readLine();
        }

        public static void StaffPrint() {
            Persons.Print();
            System.out.println(String.format("Education: %s , Position: %s", education, position));
        }

        public static void StaffInitialize() {
        }

        @Override
        public void SalariesToPay(int hour, int rate) {
            // TODO Auto-generated method stub
            int total = rate * hour;
            System.out.println("Salary to pay: " + total);
        }
    }