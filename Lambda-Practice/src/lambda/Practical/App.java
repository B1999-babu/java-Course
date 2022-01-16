package lambda.Practical;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Car> cars = Arrays.asList(
				new Car("Honda", "Accord", "Red", 22300),
				new Car("Honda", "Civic", "Blue", 17700),
				new Car("Toyota", "Land Cruiser", "White", 48500),
				new Car("Toyota", "Corolla", "Black", 16200),
				new Car("Toyota", "Camry", "Blue", 24000),
				new Car("Nissan", "Sentra", "White", 17300),
				new Car("Mitsubishi", "Lancer", "White", 20000),
				new Car("Jeep", "Wrangler", "Red", 24500)
				);
//		printCarsPriceRange(cars,1800,2000);
//		printCarByColor(cars,"Red");
		
		//This is not lambda Expression
		System.out.println("printing car price between 18000 and 20000");
		printCars(cars, new Carcondition(){

			@Override
			public boolean test(Car c) {
				
				return c.getPrice()>=18000 && c.getPrice()<=20000;
			}
			});
		
		//This is not lambda Expression
		System.out.println("Printing cars that are Blue");
		printCars(cars, new Carcondition(){

			@Override
			public boolean test(Car c) {
				
				return c.getColor().equals("Blue");
			}
			});
		
		
		//lambda Expression
		System.out.println("Lambda expression ->printing car price between 18000 and 20000");
		printCars(cars,(c) ->(c.getPrice()>=18000 && c.getPrice()<=20000));
		
		//lambda Expression
		System.out.println("Lambda expression ->Printing cars that are Blue");
		printCars(cars,(c)->c.getColor().equals("Blue"));
	}
	
	public static void printCars(List<Car> cars, Carcondition condition) {
	    for(Car c:cars) {
	    	if(condition.test(c)) {
	    		c.printCar();
	    	}
	    }
	}

	public static void printCarsPriceRange(List<Car> cars,int low,int high) {
		for(Car c:cars) {
			if(low <=c.getPrice() && c.getPrice() <= high) {
				c.printCar();
			}
		}
	}
	public static void printCarByColor(List<Car> cars,String color) {
		for(Car c:cars) {
			if(c.getColor().equals(color)) {
				c.printCar();
			}
		}
	}
}

@FunctionalInterface
interface Carcondition{
	public boolean test(Car c);
	
}