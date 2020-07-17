package abstracton.abstractionViaAbstractClass;

abstract class Car {
	
	private final String carType;
	
	/**
	 * abstract class can have constructors
	 * @param carType
	 */
	public Car(String carType) {
		this.carType = carType;
	}
	
	//these are abstract  methods
	abstract void speedUp();
	abstract void slowDown();
	abstract void turnRight();
	abstract void turnLeft();
	
	//this is a concrete method
	public String getCarType() {
		return carType;
	}
}
