/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decoratorpattern;

/**
 *
 * @author Milky
 */
public class DarkCoffee extends Beverage {
    
    public DarkCoffee(){
        description = "Dark Coffee"; 
    }
    
    public double cost(){
        return 0.89;
    }
    
}
