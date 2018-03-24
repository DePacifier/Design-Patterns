Decorator Pattern
=================                                             

General Description
-------------------
The decorator pattern is useful when a design is required to cast an object into a another type of object and extend its properties and methods that can be applied on it.

My Program
==========

Purpose
-------
This simple program is for a coffee shop. 
Coffee shops serve different kind of drinks and this drinks also have additional ingredients that can be added to them. 
For example: A person might order a coffee with Steamed Milk and Soy.
	     - The main drink being the coffee and
             - The additional ingredients(condiments) being the steamed milk and soy.


My Implementation
-----------------
- The program is implemented using two basic abstract classes called Beverage and CondimentDecorator. The beverage class used for representing the main drink and the condimentDecorator class used for representing the additional ingredients.

- The Beverage class basically has got a description property, a method to get the description and an implementable price method.

- Extending the Beverage class 4 main drinks where created, namely:
	1.  DarkCoffee
	2.  Tea
	3.  Espresso
	4.  Decaf
- When creating the main drinks classes the description property was changed to the name of the main drink and the cost method was implemented by letting it return the price of the additional ingredient.

- The CondimentDecorator class extends the Beverage class and an implemenatable get description method.
This is the main part of the decorator pattern. The codiment decorator being able to extend the beverage class it will be able to update the description of the drink by adding the condiment to the drink and also enables it to access the beverage cost method in which it can make a recurssive calling to calculate the total price of the drink.

- As a result by extending the CondimentDecorator class additional ingredients where created, namely:
	1. Leamon
	2. Soy
	3. Steamed Milk
	4. Whip
- As described earlier this classes now have the ability to update the description and calculate the total price of the drink using the beverage cost function.

Verification
============
As described earlier the program uses a decorator pattern enabling it to cast a Beverage to a condimentDecorator object enabling it to extend it properties and methods that can be applied on it. Like updating the description and also extending the cost function to include the additional price and calculate the final total price.

-------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------

The main class is: DecoratorPattern.java
The implementation was tested using this simple code:

	Beverage beverage = new Espresso(); // Create a main drink
        System.out.println(beverage.getDescription() + ": $" + beverage.cost()); //Getting main drinks decription and cost only
        
        Beverage beverage2 = new DarkCoffee(); // Create a main drink
        beverage2 = new Leamon(beverage2); //Add condiment
        beverage2 = new Leamon(beverage2); //Add condiment
        beverage2 = new Whip(beverage2); //Add condiment
        System.out.println(beverage2.getDescription() + ": $" + beverage2.cost()); //Getting decription and cost of a main drink with condiments
        
        Beverage beverage3 = new Tea(); // Create a main drink
        beverage3 = new Soy(beverage3); //Add condiment
        beverage3 = new Leamon(beverage3); //Add condiment
        beverage3 = new Whip(beverage3); //Add condiment
        System.out.println(beverage3.getDescription() + ": $" + beverage3.cost()); //Getting decription and cost of a main drink with condiments


Observer Pattern
================
                                              

General Description
-------------------
The observer pattern is useful when a design is required to inform other of an change of data or a new information has arrived and to forward or let them access the data from the provider.

My Program
==========

Purpose
-------
This simple program is for a a wather app. 
There exist an ideal weather station which provides data to our weather app, our weather app have got different display units that will show descriptions like the current temperature, statistics of the weather and what kind of weather the day will have by getting the data that the new weather data the weather station provides.


My Implementation
-----------------
- The program is implemented using three basic interface classes called Subject, DisplayElement and Observer. The subject class holds the necessary methods that a provider should have. It contains methods for registering the observers, removing observers and notifying them which will be implmented.The observer class used for implementing an update method all the display units to update their information and the DisplayElement class used for implmenting the display units displayed information.

- A weatherdata class was created extending the subject interface so that it can forward the message to the observers.
	The weatherdata class implements the notifyobservers method and always call the observers update method for 	them to get the new data whenever its data(temperature, pressure,....) is changed.

-Both the observer and displayelement interfaces were implemented on the 3 display units :
	1. CurrentConditions 
        2. StatisticsDisplay
	3. ForecastDisplay

By implementing the interfaces the display units implement their update and display functions to their advantage.

Verification
============
As described earlier the program uses an obevor pattern enabling it to forward new information or updates to the observers from the subject which was the weatherdata.

-------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------

The main class is: ObservorPattern.java
The implementation was tested using this simple code:

	WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData); //creating the object
        
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData); //creating the object
        
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData); //creating the object
        
        weatherData.setMeasurements(80, 65, 30.4f); //setting new data to weatherdata
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

