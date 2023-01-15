import it.develhope.abstraction.Boat;
import it.develhope.abstraction.Car;

public class Main {
	public static void main(String[] args) {
		Car car=new Car(4,3,1000);
		Boat boat = new Boat(4.5, 1200);
		System.out.println("--------------");
		car.doVehicleSound();
		car.showVehicleDetails();
		System.out.println("--------------");
		boat.doVehicleSound();
		boat.showVehicleDetails();
		System.out.println(boat.getBoatWeightAndSpeed());
		System.out.println("--------------");
	}
}