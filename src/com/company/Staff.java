package com.company;

public class Staff {
    public void SalaryToPay(int hour, int rate) {
    }

    public void SalaryOvertime(int overtime, int overtimeRate) {
    }

    class Staff extends com.company.Person {
        String education, Position;

        void Initialize1() {
            Initialize();
            System.out.println("Enter your Education: ");
            education = sr.nextLine();
            System.out.println("Enter your Position");
            Position = sr.nextLine();
        }

        void Print1() {
            printData();
            System.out.println("Education: " + education);
            System.out.println("Position: " + Position);
        }
    }
}