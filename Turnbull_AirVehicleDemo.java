//class creates two objects and populates all data for the objects
//first object is a Jet plane, second object is a Cargo plane
//

public class Turnbull_AirVehicleDemo {

	public static void main(String[] args) {
		
		//creates first Jet plane
		Turnbull_FighterJet newAirplane1 = new Turnbull_FighterJet();
		
		//sets variables within newAirplane1
		newAirplane1.setNumberOfEngines(2);
		newAirplane1.setNumberOfCrewMembers(1);
		newAirplane1.setNameOfJet("F-16");
		newAirplane1.setNameOfManu("General Dynamics");
		
		//displays newAirplane1 info
		System.out.println("#######################");
		System.out.println("#   FighterJet Info   #");
		System.out.println("");
		System.out.println(newAirplane1.toString());
		System.out.println("");
		newAirplane1.avTakeOff();
		newAirplane1.avFly();
		newAirplane1.breakSoundBarrier();
		newAirplane1.avLand();
		System.out.println("");
		
		//creates first Cargo plane
		Turnbull_CargoPlane newAirplane2 = new Turnbull_CargoPlane();
		
		//sets variables within newAirplane2
		newAirplane2.setNumberOfEngines(4);
		newAirplane2.setNumberOfCrewMembers(3);
		newAirplane2.setNameOfPlane("C-17");
		newAirplane2.setNameOfManu("Boeing");
		
		//displays newAirplane2 info
		System.out.println("#######################");
		System.out.println("#   CargoPlane Info   #");
		System.out.println("");
		System.out.println(newAirplane2.toString());
		System.out.println("");
		newAirplane2.avTakeOff();
		newAirplane2.avFly();
		newAirplane2.avLand();
		System.out.println("");
	}
}
