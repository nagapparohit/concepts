package abstracton.abstractionViaInterface;

public class ElectricCar implements Car {

	private final String carType;
	
	public ElectricCar(String carType) {
		this.carType = carType;
	}	
	public String getCarType(){
		return this.carType;
	}
	public void speedUp() {
		System.out.println("speep up the electric car.");
	}

	public void slowDown() {
		System.out.println("slow down the electic car.");
	}

	public void turnRight() {
		System.out.println("turn right the electric car.");
	}

	public void turnLeft() {
		System.out.println("turn left the electric car.");
	}
}
