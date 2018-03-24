/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package obsereverpattern;

/**
 *
 * @author Milky
 */
class StatisticsDisplay implements Observer, DisplayElement{
    
    private float temperature;
    private float maxTemperature = 0;
    private float minTemperature = 0;
    private float avgTemperature = 0;
    private boolean firstEnterance = true;
    private Subject weatherData;
    
    public StatisticsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        if(firstEnterance == true){
            minTemperature = this.temperature;
            maxTemperature = this.temperature;
            firstEnterance = false;
            avgTemperature = (minTemperature + maxTemperature) / 2;
            display();
        }
        else{
            if(this.temperature > maxTemperature){
                maxTemperature = this.temperature;
            }
            if(this.temperature < minTemperature){
                minTemperature = this.temperature;
            }
            avgTemperature = (minTemperature + maxTemperature) / 2;
            display();
        }
    }
    
    public void display(){
        System.out.println("Weather Statistics: \n" + "Max Temperature: " + maxTemperature +
                    "\nMin Temperature: " + minTemperature + "\nAverage Temperature: " + avgTemperature);
    }
}
