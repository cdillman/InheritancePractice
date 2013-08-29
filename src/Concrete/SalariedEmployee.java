/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete;

/**
 *
 * @author Corbin
 */
public class SalariedEmployee extends Employee{
    private double anualPay;
    private double monPay;
    
    public SalariedEmployee(double anualPay) {
        this.anualPay = anualPay;
    }
    

    public double getAnualPay() {
        return anualPay;
    }

    public void setAnualPay(double anualPay) {
        this.anualPay = anualPay;
    }

    public double getMonPay() {
        return anualPay / 12;
    }

    public void setMonPay(double monPay) {
        this.monPay = monPay;
    }
    
    
}
