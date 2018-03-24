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
public class SteamedMilk extends CondimentDecorator{
    Beverage beverage;
    
    public SteamedMilk(Beverage beverage){
        this.beverage = beverage;
    }
    
    public String getDescription(){
        return beverage.getDescription() + ", Steamed Milk";
    }
    
    public double cost(){
        return 0.10 + beverage.cost();
    }
}
