package frontend;

import entity.Car;

public class Demo_Car {
	public static void main(String[] args) {
		Car car = new Car("Marzda", "8WD");
		System.out.println(car);
		
		Car.Engine engine = car.new Engine("Crysler");
		System.out.println(engine);
	}
}
