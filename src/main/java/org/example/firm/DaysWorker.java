package org.example.firm;

public class DaysWorker extends Worker{

    public DaysWorker(String name, int salary, int time) {
        super(name, salary, time);
        this.taxes = 20;
    }

    @Override
    public int salaryCalc() {
        int res = this.salary * this.time;
        int timeTmp = time * 8;
        if (timeTmp > 200) {
            res += 2000;
        }
        return res;
    }

    @Override
    public String toString() {
        return String.format("|\t%d\t|\t%s\t|\tдни\t\t|\t%s\t\t\t|\t%s\t|",this.number, this.name, this.salaryCalc(), this.taxeCalc());
    }

}
