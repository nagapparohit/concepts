package composition;

import org.junit.Test;

public class TestComposition {

	@Test
	public void demo() {
		 Car car = new Car("MyCar");
	     System.out.println("Horsepower: " + car.getHorsePower());
	}
}
