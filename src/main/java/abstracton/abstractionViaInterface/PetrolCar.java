package abstracton.abstractionViaInterface;

public class PetrolCar implements Car {

	private final String carType;
	
	public PetrolCar(String carType) {
		this.carType = carType;
	}
	
	public void speedUp() {
		System.out.println("speed up the petrol car.");
	}

	public void slowDown() {
		System.out.println("slow down the petrol car.");
		
	}

	public void turnRight() {
		System.out.println("turn right the petrol car.");
	}

	public void turnLeft() {
		System.out.println("turn left the petrol car.");
	}

	public String getCarType() {
		return this.carType;
	}

}
