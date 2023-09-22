package org.example;

import org.example.firm.DaysWorker;
import org.example.firm.DealWorker;
import org.example.firm.HoursWorker;
import org.example.firm.Organization;

public class Main {
    public static void main(String[] args) {
        Organization org = new Organization();
        DealWorker ivanov = new DealWorker("Иванов", 1200, 0);
        DaysWorker petrov = new DaysWorker("Петров", 1000, 0);
        HoursWorker sidorov = new HoursWorker("Сидоров", 220, 0);

        petrov.setChildren(true);
        sidorov.setOffshore(true);

        org.addWorker(ivanov);
        org.addWorker(petrov);
        org.addWorker(sidorov);

        org.setWorkTime("Иванов", 15);
        org.setWorkTime("Петров", 30);
        org.setWorkTime("Сидоров", 201);

        System.out.println(org.toString());
    }
}