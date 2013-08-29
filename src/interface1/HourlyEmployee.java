/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author Corbin
 */
public abstract class HourlyEmployee implements Employee{
    private String name;
    private int empId;
    private int age;
    private double hrsWorked;
    private double hrRate;
    private double weeklyPay;

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

    public double getHrsWorked() {
        return hrsWorked;
    }

    public void setHrsWorked(double hrsWorked) {
        this.hrsWorked = hrsWorked;
    }

    public double getHrRate() {
        return hrRate;
    }

    public void setHrRate(double hrRate) {
        this.hrRate = hrRate;
    }

    @Override
    public double getWeeklyPay() {
        return hrsWorked * hrRate;
    }

    public void setWeeklyPay(double weeklyPay) {
        this.weeklyPay = weeklyPay;
    }
    
    
}
