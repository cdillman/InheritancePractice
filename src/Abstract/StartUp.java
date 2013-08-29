/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Corbin
 */
public class StartUp {
    public static void main(String[] args) {
        
        HourlyEmployee e1 = new HourlyEmployee(40,10);
        Employee e2 = new SalaryEmployee(60000);
        
        e1.setName("Corbin");
        e1.setAge(23);
        
        
        e2.setName("Mike");
        e2.setAge(26);
        
        System.out.println(e1.getName() + " is " + e1.getAge() + " " + e1.getWeeklyPay());
        System.out.println(e2.getName() + " is " + e2.getAge() + " and makes $" + e2.getWeeklyPay() + " a week.");
        
    }
}
