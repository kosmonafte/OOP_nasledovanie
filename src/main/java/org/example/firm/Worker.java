package org.example.firm;

public class Worker{

    protected String name;
    protected String orgName;
    protected int salary;
    protected long number;
    protected int time;
    protected int taxes;
    protected boolean children;
    protected boolean offshore;

    public Worker(String name, int salary, int time) {
        this.name = name;
        this.orgName = "Вкусно и точка";
        this.salary = salary;
        this.time = time;
        this.taxes = 18;
        this.children = false;
        this.offshore = false;
    }

    public int salaryCalc(){
        return this.salary * this.time;
    }

    public double taxeCalc(){
        if (this.offshore) {
            return 0;
        }
        double res = (double) (this.salaryCalc() * taxes) /100;
        if (!children) {
            res += res*0.05;
        }
        return res;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public boolean isChildren() {
        return children;
    }

    public void setChildren(boolean children) {
        this.children = children;
    }

    public boolean isOffshore() {
        return offshore;
    }

    public void setOffshore(boolean offshore) {
        this.offshore = offshore;
    }

    @Override
    public String toString() {
        return String.format("%s, оклад, %s", this.name, this.salaryCalc());
    }
}
