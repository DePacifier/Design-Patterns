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
public class DecoratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ": $" + beverage.cost());
        
        Beverage beverage2 = new DarkCoffee();
        beverage2 = new Leamon(beverage2);
        beverage2 = new Leamon(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + ": $" + beverage2.cost());
        
        Beverage beverage3 = new Tea();
        beverage3 = new Soy(beverage3);
        beverage3 = new Leamon(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + ": $" + beverage3.cost());
        
    }
    
}
