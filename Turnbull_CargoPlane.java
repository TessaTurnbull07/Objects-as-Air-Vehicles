//class that implements only AirVehicle interface
//includes variables, two constructors, getters and setters for all variables, 
//a toString method, and the three methods from Turnbull_AirVehicle interface
//

public class Turnbull_CargoPlane implements Turnbull_AirVehicle {

	//variables
	public int numberOfEngines;
	public int numberOfCrewMembers;
	public String nameOfPlane;
	public String nameOfManu;
	
	//constructors
	public Turnbull_CargoPlane() {
	}
	
	public Turnbull_CargoPlane(int numberOfEngines, int numberOfCrewMembers, 
	String nameOfPlane, String nameOfManu) {
		this.numberOfEngines = numberOfEngines;
		this.numberOfCrewMembers = numberOfCrewMembers;
		this.nameOfPlane = nameOfPlane;
		this.nameOfManu = nameOfManu;
	}
	
	//getters
	public int getNumberOfEngines() {
		return numberOfEngines;
	}

	public int getNumberOfCrewMembers() {
		return numberOfCrewMembers;
	}

	public String getNameOfPlane() {
		return nameOfPlane;
	}

	public String getNameOfManu() {
		return nameOfManu;
	}

	//setters
	public void setNumberOfEngines(int numberOfEngines) {
		this.numberOfEngines = numberOfEngines;
	}

	public void setNumberOfCrewMembers(int numberOfCrewMembers) {
		this.numberOfCrewMembers = numberOfCrewMembers;
	}

	public void setNameOfPlane(String nameOfPlane) {
		this.nameOfPlane = nameOfPlane;
	}

	public void setNameOfManu(String nameOfManu) {
		this.nameOfManu = nameOfManu;
	}

	//toString method
	@Override
	public String toString() {
		return "Turnbull_CargoPlane [numberOfEngines=" + numberOfEngines + ", numberOfCrewMembers="
				+ numberOfCrewMembers + ", nameOfPlane=" + nameOfPlane + ", nameOfManu=" + nameOfManu + "]";
	}

	//implements methods from Turnbull_AirVehicle interface
	@Override
	public void avTakeOff() {
		System.out.println(nameOfPlane + " has started the takeoff roll.");	
	}
	
	@Override
	public void avFly() {
		System.out.println(nameOfPlane + " has taken off and is now flying.");	
	}
	
	@Override
	public void avLand() {
		System.out.println(nameOfPlane + " has successfully landed.");
	}
	
}
