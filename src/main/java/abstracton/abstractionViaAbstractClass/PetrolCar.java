package abstracton.abstractionViaAbstractClass;

public class PetrolCar extends Car {

	public PetrolCar(String carType) {
		super(carType);
	}
	@Override
	void speedUp() {
		System.out.println("speed up the petrol car.");
	}
	@Override
	void slowDown() {
		System.out.println("slow down the petrol car.");
	}
	@Override
	void turnRight() {
		System.out.println("turn right the petrol car.");
	}
	@Override
	void turnLeft() {
		System.out.println("turn left the petro car.");
	}
	
}
