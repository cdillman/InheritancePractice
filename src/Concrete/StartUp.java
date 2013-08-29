/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete;

/**
 *
 * @author Corbin
 */
public class StartUp {
    public static void main(String[] args) {
        
        HourlyEmployee e1 = new HourlyEmployee(10,80);
        SalariedEmployee e2 = new SalariedEmployee(65000);
        
        e1.setName("John");
        e1.setEmpId(234115);
        e1.setAge(23);
        
        
        
        e2.setName("Mike");
        e2.setEmpId(2345543);
        e2.setAge(33);
        
        System.out.println(e1.getName() +" "+ e1.getEmpId() +" $"+ e1.getTotal());
        System.out.println(e2.getName() + " " + e2.getEmpId() + " $" + e2.getMonPay() );
    }
}
