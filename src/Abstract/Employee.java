/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Corbin
 */
public abstract class Employee {
    private String name;
    private int empId;
    private int age;
    
    public abstract double getWeeklyPay();
    public abstract double getHrsWorked();
    public abstract double getHrRate();
    public abstract double getAnualPay();
    
    public abstract void setHrsWorked();
    public abstract void setHrRate();
    public abstract void setAnualPay();
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
    
}
