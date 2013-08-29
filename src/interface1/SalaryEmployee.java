/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author Corbin
 */
public abstract class SalaryEmployee implements Employee{
    private String name;
    private int empId;
    private int age;
    private double anualPay;
    private double weeklyPay;
    private String printInfo;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAnualPay() {
        return anualPay;
    }

    public void setAnualPay(double anualPay) {
        this.anualPay = anualPay;
    }

    @Override
    public double getWeeklyPay() {
        return anualPay / 52;
    }

    public void setWeeklyPay(double weeklyPay) {
        this.weeklyPay = weeklyPay;
    }    
    
}
