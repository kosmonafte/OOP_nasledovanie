package org.example.firm;

public class HoursWorker extends Worker{

    public HoursWorker(String name, int salary, int time) {
        super(name, salary, time);
        this.taxes = 20;
    }

    @Override
    public int salaryCalc() {
        int res = this.salary * this.time;
        if (this.time > 200) {
            res += 2000;
        }
        return res;
    }

    @Override
    public String toString() {
        return String.format("|\t%d\t|\t%s\t|\tчасы\t|\t%s/%s\t\t|\t%s\t|", this.number, this.name, this.salaryCalc()/2, (this.salaryCalc()/2)/Organization.getCurse(), this.taxeCalc());
    }

}
