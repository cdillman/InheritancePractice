/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Corbin
 */
public class SalaryEmployee extends Employee{
    private double anualPay ;
    private double weeklyPay;

    public SalaryEmployee(double anualPay) {
        this.anualPay = anualPay;
    }

    
    @Override
    public double getWeeklyPay() {
       return anualPay / 52; 
    }

    @Override
    public double getHrsWorked() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getHrRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getAnualPay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHrsWorked() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHrRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAnualPay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
