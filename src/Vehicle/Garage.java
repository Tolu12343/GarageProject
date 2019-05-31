package Vehicle;
import java.util.*;
public class Garage {
	public static double billPay;
	public int idResult;
  public static ArrayList<Vehicle> vehicle = new ArrayList<>(); 
	public static void addVehicle(Vehicle p1) {
		vehicle.add(p1);

	}
	
	public void removeVehicles(Vehicle p2) {
		vehicle.remove(p2);
	}
	  public static double bill(Vehicle p3) {
		  for(int counter = 0; counter< vehicle.size(); counter++) {
			  String name = p3.Type;
			  if(name.equals("Car")) {
				  billPay = 21080.00;
				  
			  } else if(name.equals("Motorbike")){
				  billPay = 15000.00;
			  } else if(name.equals("Airplane")) {
				  billPay = 2000000.00;
			  }
		  }
		   return billPay; 
	   } 
	  
	  public static void emptyResult() {
		  vehicle.removeAll(vehicle);
		  System.out.println(vehicle);
	  }
  
}
 