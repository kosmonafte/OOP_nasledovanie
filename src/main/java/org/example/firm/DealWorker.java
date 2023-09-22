package org.example.firm;

public class DealWorker extends Worker{

    public DealWorker(String name, int salary, int time) {
        super(name, salary, time);
        this.taxes = 15;
    }

    @Override
    public String toString() {
        return String.format("|\t%d\t|\t%s\t|\tсделка\t|\t%s\t\t\t|\t%s\t|",this.number, this.name, this.salaryCalc(), this.taxeCalc());
    }

}
