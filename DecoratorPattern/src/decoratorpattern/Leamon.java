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
public class Leamon extends CondimentDecorator{
    Beverage beverage;
    
    public Leamon(Beverage beverage){
        this.beverage = beverage;
    }
    
    public String getDescription(){
        return beverage.getDescription() + ", Leamon";
    }
    
    public double cost(){
        return 0.20 + beverage.cost();
    }
}
