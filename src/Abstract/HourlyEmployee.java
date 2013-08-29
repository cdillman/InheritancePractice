/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Corbin
 */
public class HourlyEmployee extends Employee{
    private double hrsWorked;
    private double hrRate;
    private double weeklyPay;

    public HourlyEmployee(double hrsWorked, double hrRate) {
        this.hrsWorked = hrsWorked;
        this.hrRate = hrRate;
    }

    @Override
    public double getWeeklyPay() {
        return hrsWorked * hrRate;
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
