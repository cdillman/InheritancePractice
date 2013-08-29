/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete;

/**
 *
 * @author Corbin
 */
public class HourlyEmployee extends Employee{
    private double wadge;
    private double hrsWorked;
    private double total;
    
    public HourlyEmployee(double wadge, double hrsWorked) {
        this.wadge = wadge;
        this.hrsWorked = hrsWorked;
    }

    public double getWadge() {
        return wadge;
    }

    public void setWadge(double wadge) {
        this.wadge = wadge;
    }

    public double getHrsWorked() {
        return hrsWorked;
    }

    public void setHrsWorked(double hrsWorked) {
        this.hrsWorked = hrsWorked;
    }

    public double getTotal() {
        return hrsWorked * wadge;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
