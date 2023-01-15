package it.develhope.abstraction;

public abstract class Vehicle {
	public String type;
	public int numberOfWheels;

	public void showVehicleDetails() {
		System.out.println("Type: " + type + " Wheels: " + numberOfWheels);
	}

	public abstract void doVehicleSound();
}
