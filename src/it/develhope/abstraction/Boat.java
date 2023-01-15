package it.develhope.abstraction;

public class Boat extends Vehicle {
	public double maxKnotSpeed;
	public int boatKilosWeight;

	@Override
	public void doVehicleSound() {
		System.out.println("swoosh swoosh");
	}

	public Boat(double maxKnotSpeed, int boatKilosWeight) {
		this.type = "Boat";
		this.maxKnotSpeed = maxKnotSpeed;
		this.boatKilosWeight = boatKilosWeight;
	}
	public String getBoatWeightAndSpeed(){
		return "Weight: "+boatKilosWeight+" Speed: "+maxKnotSpeed;
	}
}
