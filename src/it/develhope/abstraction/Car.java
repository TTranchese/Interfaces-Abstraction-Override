package it.develhope.abstraction;

public class Car extends Vehicle {
	public int numberOfDoors;
	public double carPrice;

	@Override
	public void showVehicleDetails() {
		super.showVehicleDetails();
		System.out.println("Doors: " + numberOfDoors);
	}

	@Override
	public void doVehicleSound() {
		System.out.println("brum brum");
	}

	public Car(int numberOfWheels, int numberOfDoors, int carPrice) {
		this.type = "Car";
		this.numberOfWheels = numberOfWheels;
		this.numberOfDoors = numberOfDoors;
		this.carPrice = carPrice;
	}
}
