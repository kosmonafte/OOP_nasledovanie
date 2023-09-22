package org.example.firm;

import java.util.ArrayList;

public class Organization {
    private ArrayList<Worker> workers;

    private static double curse = 32.0;
    public Organization() {
        workers = new ArrayList<Worker>();
    }

    public void addWorker(Worker worker) {
        if (worker != null) {
            worker.setNumber(this.workers.size());
            workers.add(worker);
        }
    }

    public void delWorker(int index) {
        if (index >= 0) {
            workers.remove(index);
        }
    }

    public void delWorker(Worker worker) {
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).equals(worker)) {
                workers.remove(i);
                break;
            }
        }
    }

    public void setWorkTime(String name, int time) {
        for (Worker worker:workers) {
            if (worker.getName().equals(name)) {
                worker.setTime(time);
            }
        }
    }

    public static double getCurse() {
        return curse;
    }

    public static void setCurse(double curse) {
        Organization.curse = curse;
    }

    @Override
    public String toString() {
        String str = new String();
        int sumSalary = 0;
        double sumTaxe = 0;
        str += "Вкусно и точка, руб/дол=" + getCurse() + "\n";
        str += "---------------------------------------------------------\n";
        str += "|\tid\t|\tИмя\t\t|\tОплата\t|\tСумма Руб./Дол.\t|\tНалог\t|\n";
        str += "---------------------------------------------------------\n";
        for (Worker work:workers) {
            sumSalary += work.salaryCalc();
            sumTaxe += work.taxeCalc();
            str += work.toString() + "\n";
        }
        str += "---------------------------------------------------------\n";
        str += String.format("Итого:\t\t\t\t\t\t\t\t%d\t\t\t\t%.2f", sumSalary, sumTaxe);
        return str;
    }
}
