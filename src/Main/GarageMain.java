package Main;

import Vehicle.Airplane;
import Vehicle.Car;
import Vehicle.Garage;
import Vehicle.MotorCycle;

public class GarageMain {

	public static void main(String[] args) {
		Car car1 = new Car(1, "Car");
		Airplane Airplane1 = new Airplane(2,"Airplane");
		Car car3 = new Car(3, "Car");
		MotorCycle motorbike1 = new MotorCycle(4,"Motorbike");
		Car car2 = new Car(5, "Car");
		Airplane Airplane2 = new Airplane(6,"Airplane");
		MotorCycle motorbike2 = new MotorCycle(7,"Motorbike");
		MotorCycle motorbike3 = new MotorCycle(8,"Motorbike");
		Airplane Airplane3 = new Airplane(9,"Airplane");
		Garage.addVehicle(car1);
		Garage.addVehicle(car2);
		Garage.addVehicle(car3);
		Garage.addVehicle(motorbike1);
		Garage.addVehicle(motorbike2);
		Garage.addVehicle(motorbike3);
		Garage.addVehicle(Airplane1);
		Garage.addVehicle(Airplane2);
		Garage.addVehicle(Airplane3);
		
		for (int counter =0; counter < Garage.vehicle.size(); counter++) {
			System.out.println("The bills for a  "+ Garage.vehicle.get(counter).Type + " with " + " id " + Integer.toString(Garage.vehicle.get(counter).iD) + " is " + Double.toString(Garage.bill(Garage.vehicle.get(counter))));
			
			if(Garage.vehicle.get(counter).Type.equals("Car")) {
				System.out.println("This car  with id " + Garage.vehicle.get(counter).iD + " has " + Car.numofWheels);
			}
			
			
		}
		
		Garage.emptyResult();

		
		
		
		
		
		
	}

}
